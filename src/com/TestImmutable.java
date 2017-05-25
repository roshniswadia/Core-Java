package com;

import java.util.HashMap;
import java.util.Iterator;

import javax.print.attribute.HashAttributeSet;

public class TestImmutable {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("C", "Chemistry");
		hm.put("TEST", "test");
		FinalClassExample ex = new FinalClassExample(1, "Roshni", hm, "Roshni");
		
		ex.getTestMap().put("f", "f");
		ex.getStudent().setStuName("New NAme");
		
		System.out.println(ex.getStudent().getStuName());
		
		Iterator itr = ex.getTestMap().keySet().iterator();
		
		while( itr.hasNext()){
			String key = (String) itr.next();
			String value = ex.getTestMap().get(key);
			System.out.println("Key" + key);
			System.out.println("Value " + value);
		}
		
		HashMap<String, String> newHashMap = ex.getTestMap();
		newHashMap.put("Test", "test");
		
	}

}
