package SortingHashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapByValues {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(12, "A");
		hm.put(4, "D");
		hm.put(7, "M");
		
		System.out.println("Map Before Sorting");
		Set<Entry<Integer, String>> set = hm.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Entry) itr.next();
			System.out.println("Entry : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
		
		
		System.out.println("Map After Sorting by Values");
		Map<Integer,String> map = sortByValue(hm);
		Set<Entry<Integer, String>> set2 = map.entrySet();
		
		Iterator itr2 = set2.iterator();
		while(itr2.hasNext()){
			Map.Entry entry = (Entry) itr2.next();
			System.out.println("Entry : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
		
		System.out.println("Map After Sorting by Keys");
		Map<Integer,String> map2 = sortByKey(hm);
		Set<Entry<Integer, String>> set3 = map2.entrySet();
		
		Iterator itr3 = set3.iterator();
		while(itr3.hasNext()){
			Map.Entry entry = (Entry) itr3.next();
			System.out.println("Entry : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
		
	}

	private static Map<Integer, String> sortByValue(Map<Integer, String> hm) {
		
		List list = new LinkedList(hm.entrySet());
		Collections.sort(list,new Comparator(){

			@Override
			public int compare(Object obj1, Object obj2) {
				return ((Comparable)((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
			}
			
		});
		
		Iterator itr = list.iterator();
		HashMap linkedMap = new LinkedHashMap<>();
		
		while(itr.hasNext()){
			Map.Entry me = (Entry) itr.next();
			linkedMap.put(me.getKey(), me.getValue());
		}
		
		return linkedMap;
	}
	
private static Map<Integer, String> sortByKey(Map<Integer, String> hm) {
		
		List list = new LinkedList(hm.entrySet());
		Collections.sort(list,new Comparator(){

			@Override
			public int compare(Object obj1, Object obj2) {
				return ((Comparable)((Map.Entry) (obj1)).getKey()).compareTo(((Map.Entry) (obj2)).getKey());
			}
			
		});
		
		Iterator itr = list.iterator();
		HashMap linkedMap = new LinkedHashMap<>();
		
		while(itr.hasNext()){
			Map.Entry me = (Entry) itr.next();
			linkedMap.put(me.getKey(), me.getValue());
		}
		
		return linkedMap;
	}
}
