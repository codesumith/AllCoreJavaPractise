package com.sumith.intermidiate_terminaloperations;
import java.util.*;//base package
import java.util.stream.*;//sub package


public class Demo1 {
	
	public static void main(String[] args) {
		
	
	List<String> items =new ArrayList<String>();
	
	items.add("Apple");
	items.add("Orange");
	items.add("Mango");
	
	//Collection object to stream
	Stream<String> strm =items.stream();
	strm.forEach(p -> System.out.println(p));
	
	}
}
