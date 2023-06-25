package comp5111.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Counter2 {

    public static HashMap<String, Mapping2> map = new HashMap<String, Mapping2>();

    public static void add(int line, String name, int number) {
    	Mapping2 mapping = map.get(name);
    	mapping.add(line, number);
    }
    
    public static void initialize(String name) {
    	map.put(name, new Mapping2());
    }

    public static int get(String name) {
    	Mapping2 mapping = map.get(name);

        return mapping.instructions;
    }
    
    public static int getTotal(String name) {
    	Mapping2 mapping = map.get(name);
        return mapping.total;
    }
    
    public static HashMap<ArrayList<Integer>, String> getVisited(String name) {
    	Mapping2 mapping2 = map.get(name);
    	return mapping2.visited;
    }
    
    public static HashMap<ArrayList<Integer>, String> getNotVisited(String name) {
    	Mapping2 mapping2 = map.get(name);
    	return mapping2.notVisited;
    }
    
    public static void reset() {
    	for (Map.Entry<String, Mapping2> entry : map.entrySet()) {
			Mapping2 mapping = entry.getValue();
			
			mapping.notVisited.putAll(mapping.visited);
			mapping.visited = new HashMap<ArrayList<Integer>, String>();
			mapping.instructions = 0;
			mapping.set = new HashMap<Integer,ArrayList<Integer>>(); 
		}
    }
    
    public static void increaseTotal(String name, int line, int number, String instr) {
    	Mapping2 mapping = map.get(name);
    	
    	mapping.increaseTotal(line, number, instr);
    	//mapping.setTotal.add(line);
    }
    
    
}
