package comp5111.assignment;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Counter {
    
    public static HashMap<String, Mapping> map = new HashMap<String, Mapping>();

    public static void add(int line, String name) {
    	Mapping mapping = map.get(name);
    	mapping.add(line);
    }
    
    public static void initialize(String name) {
    	map.put(name, new Mapping());
    }

    public static int get(String name) {
    	Mapping mapping = map.get(name);

        return mapping.instructions;
    }
    
    public static int getTotal(String name) {
    	Mapping mapping = map.get(name);

        return mapping.total;
    }
    
    public static HashMap<Integer,String> getVisited(String name) {
    	Mapping mapping = map.get(name);
        return mapping.visited;
    }
    
    
    public static HashMap<Integer,String> getNotVisited(String name) {
    	Mapping mapping = map.get(name);
        return mapping.notVisited;
    }
    
    public static void reset() {
    	for (Map.Entry<String, Mapping> entry : map.entrySet()) {
			Mapping mapping = entry.getValue();
			
			mapping.notVisited.putAll(mapping.visited);
			mapping.visited = new HashMap<Integer, String>();
			mapping.instructions = 0;
			mapping.set = new HashSet<Integer>(); 
		}
    }
    
    public static void increaseTotal(Integer line, String name, String instr) {
    	Mapping mapping = map.get(name);

    	mapping.increaseTotal(line, instr);
    }
    
    public static HashSet<Integer> getSet(String name){
    	Mapping mapping = map.get(name);

    	return mapping.setTotal;
    }
    
}
