package com.sumith.HashMap;

import java.util.HashMap;

public class HashMapDemo3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map =new HashMap<>();
		map.put(1, "Java");
		map.put(2, "is");
		map.put(3, "best");
		map.remove(3);     //will remove the complere entry 
		String val =(String)map.get(3);
		System.out.println("Value of key 3 is :"+val);
		map.forEach((k,v) -> System.out.println(k+" : "+v));

	}

}
