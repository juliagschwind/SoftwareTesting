package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;

public class Instrumenter3 extends BodyTransformer {

    /* some internal fields */
    static SootClass counterClass;
    static SootMethod addMethod;    
    static SootMethod closeMethod;

    //static SootClass thisclass;
    //static SootMethod tester;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.Counter3");
        addMethod = counterClass.getMethodByName("add");
        closeMethod = counterClass.getMethodByName("close");

        //thisclass = Scene.v().loadClassAndSupport("task3.Instrumenter3");
        //tester = thisclass.getMethodByName("tester");
    }

    /*
     * internalTransform goes through a method body and inserts counter
     * instructions before method returns
     */
    @Override
    protected void internalTransform(Body body, String phase, Map options) {
        // body's method
        SootMethod method = body.getMethod();
        String name = method.getDeclaringClass().getName();
        // we dont instrument constructor (<init>) and static initializer (<clinit>)
        // Note that you should instrument the constructor and static initializer in your Assignments.
        
        // debugging
        //System.out.println("instrumenting method: " + method.getSignature());

        // get body's unit as a chain
        Chain<Unit> units = body.getUnits();

        // get a snapshot iterator of the unit since we are going to
        // mutate the chain when iterating over it.
        //
        Iterator<?> stmtIt = units.snapshotIterator();
        
        int current = 0;
        int prev = -1;
        // typical while loop for iterating over each statement
        while (stmtIt.hasNext()) {

            // cast back to a statement.
            Stmt stmt = (Stmt) stmtIt.next();

            int line = stmt.getJavaSourceStartLineNumber();

            if(line != prev) {
            	prev = line;
            	current = 0;
            }else {
            	current++;
            }
            
            InvokeExpr closeExpr = null;

            // there are many kinds of statements, here we are only
            // interested in return statements
            // NOTE: there are two kinds of return statements, with or without return value
            closeExpr = Jimple.v().newStaticInvokeExpr(closeMethod.makeRef(), IntConstant.v(line), IntConstant.v(current), StringConstant.v(name));
            
            // 2. then, make a invoke statement
            Stmt closeStmt = Jimple.v().newInvokeStmt(closeExpr);

            // 3. insert new statement into the chain, before return statement
            // (we are mutating the unit chain).
            units.insertBefore(closeStmt, stmt);
            //System.out.println(total + "  " + stmt.toString());
            if (stmt instanceof IfStmt) {
                // now we reach the real instruction
                // call Chain.insertBefore() to insert instructions
                //
            	String instr = stmt.toString();
                Counter3.increaseTotal(name, line, current, instr);
                //System.out.println( stmt.toString() + "    " + cond.getOp1().toString() + " " + cond.getSymbol() + " " + cond.getOp2().toString());
                // 1. first, make a new invoke expression
                InvokeExpr incExpr = null;
                incExpr = Jimple.v().newStaticInvokeExpr(addMethod.makeRef(), IntConstant.v(line), IntConstant.v(current), StringConstant.v(name), StringConstant.v(instr));
                
                // 2. then, make a invoke statement
                Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);

                // 3. insert new statement into the chain, before return statement
                // (we are mutating the unit chain).
                units.insertBefore(incStmt, stmt);
            }
        }
    }
    
    protected void tester(Value v) {
    	System.out.println("works");
    }
}


