package com.sumith.hashset;

import java.util.HashSet;

public class HSDemo1 {

	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("Ravi");
		hs.add("Akhil");
		hs.add("Vijay");
		hs.add("Ravi");
		hs.add("Ajay");
		hs.add("Sweta");
		hs.add(null);
		hs.add(null);
		hs.forEach(str -> System.out.println(str));
		

	}

}
