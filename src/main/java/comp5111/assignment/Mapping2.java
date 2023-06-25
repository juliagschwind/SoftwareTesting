package comp5111.assignment;

import java.util.ArrayList;
import java.util.HashMap;


public class Mapping2 {
	public int instructions = 0;
	public int total = 0;
    public HashMap<Integer,ArrayList<Integer>> set = new HashMap<Integer,ArrayList<Integer>>(); 
    public HashMap<ArrayList<Integer>,String> visited = new HashMap<ArrayList<Integer>,String>(); 
    public HashMap<ArrayList<Integer>,String> notVisited = new HashMap<ArrayList<Integer>,String>(); 

    
    public void add(int line, int number) {
    	if(!(set.containsKey(Integer.valueOf(line)))) {
    		set.put(line, new ArrayList<Integer>());
    	}
    	if(!(set.get(line).contains(Integer.valueOf(number)))) {
    		ArrayList<Integer> current = new ArrayList<Integer>();
        	current.add(line);
        	current.add(number);
            instructions += 1;
            set.get(line).add(Integer.valueOf(number));
            String instr = notVisited.get(current);
            notVisited.remove(current);
            visited.put(current, instr);
            
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
    	total++;
    }
   
    
}

