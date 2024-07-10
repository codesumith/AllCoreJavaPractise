package com.sumith.Linkedhashset;

import java.util.LinkedHashSet;

public class LinkhashDemo {
	
	public static void main(String[] args) {
		LinkedHashSet <String> lk=new LinkedHashSet<String>();
		
		lk.add("Ravi");
		lk.add("Vijay");
		lk.add("Ravi");
		lk.add("Ajay");
		lk.add("Pawan");
		lk.add("Shiva");
		lk.add(null);
		lk.add("Ganesh");
		
		lk.forEach(x -> System.out.println(x));
	}

}
