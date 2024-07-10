package com.sumith.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,String> map =new HashMap<>();
		
		map.put("Ravi", "12345");// ravi is key and 12345 is value
		map.put("Rahul", "12345");
		map.put("Ashwin", "5678");
		map.put(null, "6390");
		map.put("Ravi", "1529");
		
		
		System.out.println(map);
		
		System.out.println(map.get(null));
		
		System.out.println(map.get("Virat"));//null because key is not available
		
		map.forEach((k,v) -> System.out.println("key = "+k+", value = "+v));

	}

}
