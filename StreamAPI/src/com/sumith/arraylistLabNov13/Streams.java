package com.sumith.arraylistLabNov13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Streams {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Apple");
		l1.add("Python");
		l1.add("HTML");
		
		l1.forEach(c1 -> System.out.println(c1.toUpperCase()));
		
		Consumer<String> c1 =new Consumer<String>()
				{
			@Override
			public void accept(String t)
			{
				System.out.println(t.toUpperCase());
			}
				};
				
				l1.forEach(c1);
				
				
				Map<String,String> map =new HashMap<String,String>();
				map.put("A", "Ravi");
				map.put("B", "Killer");
				map.put("C", "Cetaphil");
				
				map.forEach((k,v) -> System.out.println(k+" "+v));
				
				
	}
}
