package comp5111.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Mapping3 {
	public int instructions = 0;
	public int total = 0;
    public HashMap<ArrayList<Integer>,ArrayList<ArrayList<Integer>>> set = new HashMap<ArrayList<Integer>,ArrayList<ArrayList<Integer>>>(); 
    public HashMap<ArrayList<Integer>,String> visited = new HashMap<ArrayList<Integer>,String>(); 
    public HashMap<ArrayList<Integer>,String> notVisited = new HashMap<ArrayList<Integer>,String>(); 


    boolean open = false;
    ArrayList<Integer> current;
    
    public void add(int line, int number, String instr) {
    	open = true;
    	current = new ArrayList<Integer>();
    	current.add(line);
    	current.add(number);
    	if(!visited.containsKey(current)) {
    		visited.put(current, instr);
    	}
    }
    
    public void close(int line, int number) {
    	ArrayList<Integer> end = new ArrayList<Integer>();
    	end.add(line);
    	end.add(number);
    	if(open) {
    		open = false;
    		if(!(set.containsKey(current))) {
    			set.put(current, new ArrayList<ArrayList<Integer>>());
    		}
    		if(!(set.get(current).contains(end))) {
    			set.get(current).add(end);
    			instructions++;
    			if(set.get(current).size() == 2) {
    				notVisited.remove(current);
    			}
    		}
    	}
    }
    

    public int get() {
        return instructions;
    }
    
    public int getTotal() {
        return total;
    }
    
    
    public void increaseTotal(int line, int number, String instr) {
    	ArrayList<Integer> current = new ArrayList<Integer>();
    	current.add(line);
    	current.add(number);
    	notVisited.put(current, instr);
    	total+=2;
    }
}

