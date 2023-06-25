package comp5111.assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.junit.runner.JUnitCore;

import soot.Pack;
import soot.PackManager;
import soot.Scene;
import soot.Transform;
import soot.options.Options;



public class Assignment1 {
	public static String[] classes;

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		String[] classNames = { "comp5111.assignment.cut.Subject$NumberTasks",
				"comp5111.assignment.cut.Subject$CharTasks", "comp5111.assignment.cut.Subject$GregorianTasks",
				"comp5111.assignment.cut.Subject$ArrayTasks", "comp5111.assignment.cut.Subject",
				"comp5111.assignment.cut.Subject$FilenameTasks", "comp5111.assignment.cut.Subject$StringTasks",
				"comp5111.assignment.cut.Subject$BooleanTasks" };
		// String[] arguments = {"1","comp5111.assignment.cut.Subject$CharTasks"};
		/* check the arguments */
		if ((args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
			System.err.println("Usage: java comp5111.assignment.Assignment1 [coverage level] test-suite [soot options] "
					+ "classname");
			System.err.println("Usage: [coverage level] = 0 for statement coverage");
			System.err.println("Usage: [coverage level] = 1 for branch coverage");
			System.err.println("Usage: [coverage level] = 2 for line coverage");
			System.exit(0);
		}

		// these args will be passed into soot.
		// String[] classNames = Arrays.copyOfRange(args, 1, args.length);

		classes = classNames;

		if (args[0].compareTo("0") == 0) {
			
			
			
			FileWriter file = new FileWriter("stmt_coverage.txt");
			file.write("Statement Coverage: ");
			
			for (int i = 0; i < classNames.length; i++) {
				Counter2.initialize(classNames[i]);
			}
			instrumentWithSoot2();
			String[] tests = { "comp5111.assignment.cut.Regression__Test" , "comp5111.assignment.cut.RegressionTest0", "comp5111.assignment.cut.RegressionTest1", "comp5111.assignment.cut.RegressionTest2", "comp5111.assignment.cut.RegressionTest3", "comp5111.assignment.cut.RegressionTest4"};

			for (int test = 0; test < tests.length; test++) {
				file.append("\n\n\nCoverage of Test Suite: " + tests[test] + "\n\n");
				runJunitTests(tests[test]);
				
				double overall = 0.0;
				double scored = 0.0;
				
				for (int i = 0; i < classNames.length; i++) {
					String name = classNames[i];
					int total = Counter2.getTotal(name);
					overall += total;
					scored += Counter2.get(name);
					// If there are no statement, i set the percentage to 100
					double percentage = 1.0;
					if (total > 0) {
						percentage = (double) Counter2.get(name)*100.0 / (double) total;
					}
					
					file.append(name + "\n" + Counter2.get(name) + " Instructions from a total of " + total
							+ " Instructions were covered.\n" + "Percentage: " + percentage + "%\n\n");
					
				}
				
				file.append("Overall Statement Coverage: " + scored / overall * 100 + "%\n");
				file.append(
						"\n\n\nIn the following part you can see which instructions were executed. Before every instruction you can see two numbers\n"
								+ "in the form of (x,y), for Example (1,5). This indicates that the following Instruction can be found on line x of the Java code. \n"
								+ "y denotes that it is the y-th Jimple Instruction generated from the corresponding Java line.\n"
								+ "After each listed instructions you can find a NO if the instruction wasn't executed and a YES if it was. \n");

				for (int i = 0; i < classNames.length; i++) {
					String name = classNames[i];
					file.append("\n\n" + name + "\n\n");
					file.append("\nIn the following all of the instructions which were covered will be shown: \n\n");

					for (Map.Entry<ArrayList<Integer>, String> entry : Counter2.getVisited(name).entrySet()) {
						ArrayList<Integer> key = entry.getKey();
						String instr = entry.getValue(); 
						int line = key.get(0);
						int number = key.get(1);
						file.append("(" + line + ", " + number + "): " + instr + "  YES\n");
					}
					file.append("\nIn the following all of the instructions which were not covered will be shown: \n\n");
					for (Map.Entry<ArrayList<Integer>, String> entry : Counter2.getNotVisited(name).entrySet()) {
						ArrayList<Integer> key = entry.getKey();
						String instr = entry.getValue();
						int line = key.get(0);
						int number = key.get(1);
						file.append("(" + line + ", " + number + "): " + instr + "  NO ");
						file.append("\n");
					}
				}
				Counter2.reset();
			}
			file.close();

			
			
			
			
			
			
		} else if (args[0].compareTo("1") == 0) {
			// TODO invoke your branch coverage instrument function
			FileWriter file = new FileWriter("branch_coverage.txt");
			file.write("Branch Coverage: ");
			for (int i = 0; i < classNames.length; i++) {
				Counter3.initialize(classNames[i]);
			}
			String[] tests = { "comp5111.assignment.cut.Regression__Test" , "comp5111.assignment.cut.RegressionTest0", "comp5111.assignment.cut.RegressionTest1", "comp5111.assignment.cut.RegressionTest2", "comp5111.assignment.cut.RegressionTest3", "comp5111.assignment.cut.RegressionTest4"};
			instrumentWithSoot3();

			for (int test = 0; test < tests.length; test++) {
				file.append("\n\n\nCoverage of Test Suite: " + tests[test] + "\n\n");
				runJunitTests(tests[test]);
				double overall = 0.0;
				double scored = 0.0;
				for (int i = 0; i < classNames.length; i++) {
					String name = classNames[i];
					int total = Counter3.getTotal(name);
					overall += total;
					scored += Counter3.get(name);
					double percentage = 100.0;
					if (total > 0) {
						percentage = (double) Counter3.get(name) / (double) total * 100;
					}
					file.append(name + "\n" + Counter3.get(name) + " Branches from a total of " + total
							+ " Branches were covered.\n" + "Percentage: " + percentage + "%\n\n");
				}
				file.append("Overall Branch Coverage: " + scored / overall * 100 + "%\n");
				file.append(
						"\n\n\nIn the following part you can see which branches were executed. Before every branch instruction you can see two numbers\n"
								+ "in the form of (x,y), for Example (1,5). This indicates that the following Instruction can be found on line x of the Java code. \n"
								+ "y denotes that it is the y-th Jimple Instruction generated from the corresponding Java line. Only Branch instructions will be shown.\n"
								+ "After each listed instructions you can find a NO if one or more branches weren't executed and a YES if one or more branches were taken"
								+ "If it was executed you will also find a List of (x,y) values which denote the statements to which we jumped.\n\n");

				for (int i = 0; i < classNames.length; i++) {
					String name = classNames[i];
					file.append("\n\n" + name + "\n\n");
					file.append("\nIn the following all of the instructions which were covered will be shown: \n\n");

					for (Map.Entry<ArrayList<Integer>, String> entry : Counter3.getVisited(name).entrySet()) {
						ArrayList<Integer> key = entry.getKey();
						String instr = entry.getValue();
						int line = key.get(0);
						int number = key.get(1);
						file.append("(" + line + ", " + number + "): " + instr + "  YES, jumped to: ");
						ArrayList<ArrayList<Integer>> mapped = Counter3.getJumps(name).get(key);
						for (ArrayList<Integer> jump : mapped) {
							line = jump.get(0);
							number = jump.get(1);
							file.append("(" + line + ", " + number + ") ");
						}
						file.append("\n");
					}
					file.append(
							"\nIn the following all of the instructions which were not covered will be shown: \n\n");
					for (Map.Entry<ArrayList<Integer>, String> entry : Counter3.getNotVisited(name).entrySet()) {
						ArrayList<Integer> key = entry.getKey();
						String instr = entry.getValue();
						int line = key.get(0);
						int number = key.get(1);
						file.append("(" + line + ", " + number + "): " + instr + "  NO ");
						file.append("\n");
					}
				}
				Counter3.reset();
				
			}

			file.close();
			// TODO run tests on instrumented classes to generate coverage report

			
			
			
		} else if (args[0].compareTo("2") == 0) {
			
			FileWriter file = new FileWriter("line_coverage.txt");
			file.write("Line Coverage: ");
			for (int i = 0; i < classNames.length; i++) {
				Counter.initialize(classNames[i]);
			}
			instrumentWithSoot();
			String[] tests = { "comp5111.assignment.cut.Regression__Test" , "comp5111.assignment.cut.RegressionTest0", "comp5111.assignment.cut.RegressionTest1", "comp5111.assignment.cut.RegressionTest2", "comp5111.assignment.cut.RegressionTest3", "comp5111.assignment.cut.RegressionTest4"};

			for (int test = 0; test < tests.length; test++) {
				file.append("\n\n\nCoverage of Test Suite: " + tests[test] + "\n\n");

				runJunitTests(tests[test]);
				double overall = 0.0;
				double scored = 0.0;
				for (int i = 0; i < classNames.length; i++) {
					String name = classNames[i];
					int total = Counter.getTotal(name);
					overall += total;
					scored += Counter.get(name);
					double percentage = 1.0;
					if (total > 0) {
						percentage = (double) Counter.get(name)*100 / (double) total;
					}
					file.append(name + "\n" + Counter.get(name) + " Lines from a total of " + total
							+ " Lines were covered.\n" + "Percentage: " + percentage + "%\n\n");
				}
				file.append("Overall Line Coverage: " + scored / overall * 100 + "%\n");

				file.append(
						"\n\n\nIn the following part you can see which lines were executed. Before every statement you can see a number which indicates the line on which the statement was found\n"
								+ "After each listed instructions you can find a NO if the line wasn't executed and a YES if it was. Only the first executed statement belonging to a specific line will be shown");

				for (int i = 0; i < classNames.length; i++) {
					String name = classNames[i];
					file.append("\n\n" + name + "\n\n");
					file.append("\nIn the following all of the lines which were covered will be shown: \n\n");

					for (Map.Entry<Integer, String> entry : Counter.getVisited(name).entrySet()) {
						Integer key = entry.getKey();
						String instr = entry.getValue();
						file.append("(" + key + "): " + instr + "  YES");
						file.append("\n");
					}
					file.append("\nIn the following all of the instructions which were not covered will be shown: \n\n");
					for (Map.Entry<Integer, String> entry : Counter.getNotVisited(name).entrySet()) {
						Integer key = entry.getKey();
						String instr = entry.getValue();
						file.append("(" + key + "): " + instr + "  NO ");
						file.append("\n");
					}
				}
				Counter3.reset();
			}
			file.close();
		}
	}

	private static void instrumentWithSoot2() {
		// the path to the compiled Subject class file
		String classUnderTestPath = "./src/main/java/raw-classes";
		String targetPath = "./src/main/java/target/classes";

		String classPathSeparator = ":";
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			classPathSeparator = ";";
		}

		/* Set the soot-classpath to include the helper class and class to analyze */
		Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath
				+ classPathSeparator + classUnderTestPath);

		// we set the soot output dir to target/classes so that the instrumented class
		// can override the class file
		Options.v().set_output_dir(targetPath);

		// retain line numbers
		Options.v().set_keep_line_number(true);
		// retain the original variable names
		Options.v().setPhaseOption("jb", "use-original-names:true");

		/* add a phase to transformer pack by call Pack.add */
		Pack jtp = PackManager.v().getPack("jtp");

		Instrumenter2 instrumenter = new Instrumenter2();
		jtp.add(new Transform("jtp.instrumenter", instrumenter));

		// String classUnderTest = "castle.comp5111.example.Subject";
		// pass arguments to soot
		soot.Main.main(classes); // added phases will be executed in this method
	}

	private static void instrumentWithSoot3() {
		// the path to the compiled Subject class file
		String classUnderTestPath = "./src/main/java/raw-classes";
		String targetPath = "./src/main/java/target/classes";

		String classPathSeparator = ":";
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			classPathSeparator = ";";
		}

		/* Set the soot-classpath to include the helper class and class to analyze */
		Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath
				+ classPathSeparator + classUnderTestPath);

		// we set the soot output dir to target/classes so that the instrumented class
		// can override the class file
		Options.v().set_output_dir(targetPath);

		// retain line numbers
		Options.v().set_keep_line_number(true);
		// retain the original variable names
		Options.v().setPhaseOption("jb", "use-original-names:true");

		/* add a phase to transformer pack by call Pack.add */
		Pack jtp = PackManager.v().getPack("jtp");

		Instrumenter3 instrumenter = new Instrumenter3();
		jtp.add(new Transform("jtp.instrumenter", instrumenter));

		// String classUnderTest = "castle.comp5111.example.Subject";
		// pass arguments to soot
		soot.Main.main(classes); // added phases will be executed in this method
	}

	private static void instrumentWithSoot() {
		// the path to the compiled Subject class file
		String classUnderTestPath = "./src/main/java/raw-classes";
		String targetPath = "./src/main/java/target/classes";

		String classPathSeparator = ":";
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			classPathSeparator = ";";
		}

		/* Set the soot-classpath to include the helper class and class to analyze */
		Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath
				+ classPathSeparator + classUnderTestPath);

		// we set the soot output dir to target/classes so that the instrumented class
		// can override the class file
		Options.v().set_output_dir(targetPath);

		// retain line numbers
		Options.v().set_keep_line_number(true);
		// retain the original variable names
		Options.v().setPhaseOption("jb", "use-original-names:true");

		/* add a phase to transformer pack by call Pack.add */
		Pack jtp = PackManager.v().getPack("jtp");

		Instrumenter instrumenter = new Instrumenter();
		jtp.add(new Transform("jtp.instrumenter", instrumenter));

		// String classUnderTest = "castle.comp5111.example.Subject";
		// pass arguments to soot
		soot.Main.main(classes); // added phases will be executed in this method
	}

	private static void runJunitTests(String test) {
		Class<?> testClass = null;
		try {
			// here we programmitically run junit tests
			testClass = Class.forName(test); // TODO test ändern -> iterate through all test cases and always reset
												// counter
			JUnitCore junit = new JUnitCore();
			System.out.println("Running junit test: " + testClass.getName());
			junit.run(testClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}