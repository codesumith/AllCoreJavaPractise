package com.sumith.cocurrentcollection;

import java.util.*;

public class Collections3 {

	public static void main(String[] args) {
		
		Set<String> s = Collections.synchronizedSet(new HashSet<>());
		s.add("Apple");
		s.add("Orange");
		s.add("Grapes");
		s.add("Mango");
		s.add("Guava");
		s.add("Mango");
		
		System.out.println("Set after syncronization :");
		
		synchronized(s)
		{
			Spliterator<String> itr = s.spliterator();
			itr.forEachRemaining(str -> System.out.println(str));
		}
		
	}

}
