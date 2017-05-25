package HashcodeEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Test {
	public static void main(String[] args) {
		Map map = new HashMap<Employee,Integer>();
		map.put(new Employee(1, "Roshni"), 1);
		map.put(new Employee(2, "Test"), 2);
		
		System.out.println(map.get(new Employee(1, "Roshni")));
		
		Map map2 = new HashMap<Integer,Integer>();
		map2.put(5, 1);
		map2.put(7, 2);
		
		System.out.println(map2.get(5));
		
		Map map3 = new HashMap<String,String>();
		map3.put("A", "B");
		map3.put("C", "D");
		
		System.out.println(map3.get("A"));
		
		Set hashset = new HashSet<Employee>();
		hashset.add(new Employee(1,"Roshni"));
		hashset.add(new Employee(3,"Simi"));
		
		System.out.println("$$$ output $$$ " + hashset);
		Iterator setIterator = hashset.iterator();
		while(setIterator.hasNext()){
			System.out.println("## output ##"+setIterator.next());
		}
	}
}
