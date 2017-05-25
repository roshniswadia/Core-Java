package sorting.customobject.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestSorting {

	public static void main(String[] args) {
		Map unsortedMap  = new HashMap<Integer,Employee>();
		unsortedMap.put(1, new Employee(1,"Roshni"));
		unsortedMap.put(2, new Employee(2,"Amit"));
		unsortedMap.put(3, new Employee(3,"Simi"));
		
		System.out.println("Map Before Sorting");
		Set<Entry<Integer, String>> set = unsortedMap.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Entry) itr.next();
			System.out.println("Entry : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
		
		
		System.out.println("Map After Sorting by Id");
		Map<Integer,String> map = sortById(unsortedMap);
		Set<Entry<Integer, String>> set2 = map.entrySet();
		
		Iterator itr2 = set2.iterator();
		while(itr2.hasNext()){
			Map.Entry entry = (Entry) itr2.next();
			System.out.println("Entry : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
		
		Map test  = new HashMap<Employee,Integer>();
		test.put(new Employee(1,"Roshni"),1);
		test.put(new Employee(2,"Amit"),2);
		test.put(new Employee(3,"Simi"),3);
		
		System.out.println("$$$ output $$$ " + test.get(new Employee(1,"Roshni")));
		
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static Map<Integer,Employee> sortById(Map<Integer,Employee> hm){
		List list = new LinkedList(hm.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<Integer,Employee>>() {

			@Override
			public int compare(Entry<Integer, Employee> emp1, Entry<Integer, Employee> emp2) {
				if (emp1.getValue().getId() == emp2.getValue().getId()){
					return 0;
				}else if (emp1.getValue().getId() > emp2.getValue().getId()){
					return 1;
				}else {
					return -1;
				}
			}
		});
		
		Map sortedMap = new LinkedHashMap<Integer,String>(); 
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry) itr.next();
			sortedMap.put(me.getKey(), me.getValue());
		}
		return sortedMap;
	}
}
