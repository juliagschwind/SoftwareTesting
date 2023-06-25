package comp5111.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Counter3 {

    public static HashMap<String, Mapping3> map = new HashMap<String, Mapping3>();
    
    public static void close(int line, int number, String name) {
    	Mapping3 mapping = map.get(name);
    	mapping.close(line, number);
    }

    public static void add(int line, int number, String name, String instr) {
    	Mapping3 mapping = map.get(name);
    	mapping.add(line, number, instr);
    }
    
    public static void initialize(String name) {
    	map.put(name, new Mapping3());
    }
    
    public static void reset() {
    	for (Map.Entry<String, Mapping3> entry : map.entrySet()) {
			Mapping3 mapping = entry.getValue();
			
			mapping.notVisited.putAll(mapping.visited);
			mapping.visited = new HashMap<ArrayList<Integer>, String>();
			mapping.instructions = 0;
			mapping.set = new HashMap<ArrayList<Integer>,ArrayList<ArrayList<Integer>>>(); 
			mapping.open = false;
		}
    }

    public static int get(String name) {
    	Mapping3 mapping = map.get(name);
        return mapping.instructions;
    }
    
    public static HashMap<ArrayList<Integer>,String> getVisited(String name) {
    	Mapping3 mapping = map.get(name);
        return mapping.visited;
    }
    
    public static HashMap<ArrayList<Integer>,ArrayList<ArrayList<Integer>>> getJumps(String name) {
    	Mapping3 mapping = map.get(name);
        return mapping.set;
    }
    
    public static HashMap<ArrayList<Integer>,String> getNotVisited(String name) {
    	Mapping3 mapping = map.get(name);
        return mapping.notVisited;
    }
    
    public static int getTotal(String name) {
    	Mapping3 mapping = map.get(name);
        return mapping.total;
    }
    
    
    public static void increaseTotal(String name, int line, int number, String instr) {
    	Mapping3 mapping = map.get(name);
    	mapping.increaseTotal(line, number, instr);
    }
    
    
}