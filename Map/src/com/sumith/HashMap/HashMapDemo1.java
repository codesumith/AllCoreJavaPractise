package com.sumith.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		
		map.put("Ravi", "Ampt");
		map.put(new String("Ravi"), "Hyd");
		
		System.out.println(map.size());
	    System.out.println(map);
		
		String str1 ="Ravi";
		Object str2 = new String("Ravi");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		
		Map<Integer,String> map1=new HashMap<>();
		map1.put(128, "Ampt");
		map1.put(new Integer(128), "Hyd");
		System.out.println(map.size());
		
		   System.out.println(map1);
		   
		String str ="A";
		System.out.println(str.hashCode());
	}

}
