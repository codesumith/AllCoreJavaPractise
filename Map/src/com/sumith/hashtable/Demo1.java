package com.sumith.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Demo1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Hashtable<Integer,String> map =new Hashtable<>();
		
		map.put(1, "Java");
		map.put(2, "is");
		map.put(3, "Best");
		map.put(4, "language");
		
		//map.put(5, null);
		
		System.out.println(map);
		
		System.out.println(". . . . . . . . . . . .");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" = "+m.getValue());
		}

		
		

	}

}
