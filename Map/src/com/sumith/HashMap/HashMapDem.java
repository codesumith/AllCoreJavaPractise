package com.sumith.HashMap;

import java.util.HashMap;

public class HashMapDem {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm =new HashMap<>();
		
		hm.put(1, "JSE");
		hm.put(2, "JEE");
		hm.put(3, "JME");
		hm.put(4, "JavaFX");
		hm.put(5, null);
		hm.put(6, null);
		
		System.out.println("Intial map elements : "+hm);
		System.out.println("Key 2 is present or not :"+hm.containsKey(2));
		System.out.println("JME is present or not : "+hm.containsValue("JME"));
		System.out.println("Size of Map : "+hm.size());
		hm.clear();
		System.out.println("Map elements after invoking clear function :"+hm);
		
	}
}
