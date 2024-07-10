package com.sumith.test_nov18th;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertAllStringIntoUpperCase {
	
	public static void main(String[] args) {
		
		List<String> s= Arrays.asList("arjun","anil");
		
		System.out.println(s);
		
		List<String> s1=s.stream().map(v -> v.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(s1);
	}

}
