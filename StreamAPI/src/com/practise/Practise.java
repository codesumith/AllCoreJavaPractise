package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Practise {
	
	public static void main(String[] args) {
		List <String > list = new ArrayList<>();
		list.add("Mango");
		list.add("Orange");
		list.add("Guava");
		
		Stream<String> stream = list.stream();
		stream.forEach(f -> System.out.println(f));
		
		
 	}

}