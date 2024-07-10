package com.sumith.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Map<Integer,String> map =new HashMap<>();
		map.put(1, "C");
		map.put(2, "C++");
		map.put(3, "Java");
		map.put(4, ".net");
		
		map.forEach((k,v) -> System.out.println("Key :"+k+", Vlaue :"+v));
		
		System.out.println("Return old object value :"+map.put(4, "Python"));
		
		for( Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" $ "+m.getValue());
		}

	}

}
