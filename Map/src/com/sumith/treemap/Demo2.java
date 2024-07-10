package com.sumith.treemap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Demo2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Map map =new TreeMap();
		map.put("key2", "value2");
		map.put("key3","value3");
		map.put("key1", "value1");
		
		System.out.println(map);
		
		SortedMap x= (SortedMap) map;
		System.out.println("First key is :"+x.firstKey());
		System.out.println("Last key is :"+x.lastKey());
		

	}

}
