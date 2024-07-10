package com.sumith.linkedhhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1 {
	
	public static void main(String[] args) {
		Map<String,String> map =new LinkedHashMap<>();
		
		map.put("Ravi", "1234");
		map.put("Rahul", "1234");
		map.put("Ashwin", "1456");
		map.put("Samir", "1239");
		
		map.forEach((k,v) -> System.out.println(k+" : "+v));
	}

}
