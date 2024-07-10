package com.sumith.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo5 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Map<String,String> map =new HashMap<>(9,0.85f);
		map.put("key", "value");
		map.put("key2", "values2");
		map.put("key3", "value3");
		map.put("key7", "value7");
		
		Set keys =map.keySet(); //keyset return is set
		System.out.println(keys);
		
		Collection val =map.values(); //values return type is Collection 
		System.out.println(val);
		
		map.forEach((k,v) -> System.out.println(k+" : "+v));
				
	}

}
