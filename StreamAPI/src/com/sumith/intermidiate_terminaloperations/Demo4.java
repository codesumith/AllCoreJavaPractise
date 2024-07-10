package com.sumith.intermidiate_terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		List<String>  list =Arrays.asList("Ravi", "Rahul", "Akshar", "Roshan","Raj","Ankit");
		
		List<String> startsWithR =list.stream().filter(p -> p.startsWith("R"))
				.collect(Collectors.toList());
		
		System.out.println(startsWithR);

	}

}
