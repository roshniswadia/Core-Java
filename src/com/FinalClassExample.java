package com;

import java.util.HashMap;
import java.util.Iterator;

public final class FinalClassExample {

	private int id;
	
	private String name;
	
	private HashMap<String, String> testMap;
	
	private Student student;
	
	public Student getStudent() throws CloneNotSupportedException {
		return (Student) student.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}
	
	public FinalClassExample(int id,String name,HashMap<String,String> hashmap,String studentName) {
		
		this.id= id;
		this.name=name;
		
		this.student = new Student(studentName);
		
		/*HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		Iterator<String> it = hashmap.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, hashmap.get(key));
		}
		this.testMap=tempMap;*/
		
		this.testMap=hashmap;
		
	}
}
