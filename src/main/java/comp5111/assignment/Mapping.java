package comp5111.assignment;
import java.util.HashMap;
import java.util.HashSet;

public class Mapping {
	public int instructions = 0;
	public int total = 0;
    public HashSet<Integer> set = new HashSet<Integer>(); 
    public HashSet<Integer> setTotal = new HashSet<Integer>();
    public HashMap<Integer,String> visited = new HashMap<Integer,String>(); 
    public HashMap<Integer,String> notVisited = new HashMap<Integer,String>(); 

    
    public void add(int line) {
    	if(!(set.contains(Integer.valueOf(line)))) {
            instructions += 1;
            set.add(Integer.valueOf(line));
            String instr = notVisited.get(Integer.valueOf(line));
            visited.put(Integer.valueOf(line), instr);
            notVisited.remove(Integer.valueOf(line));
            
    	}
    }

    public int get() {
        return instructions;
    }
    
    public int getTotal() {
        return total;
    }
    
    
    public void reset() {
    	instructions = 0;
    	set = new HashSet<Integer>();
    	total = 0;
    }
    
    public void increaseTotal(Integer line, String instr) {
    	total++;
    	setTotal.add(line);
    	notVisited.put(line, instr);
    }
    
    public HashSet<Integer> getSet(){
    	return setTotal;
    }
    
}

