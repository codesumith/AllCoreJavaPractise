package com.sumith.intermidiate_terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedComparator {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("Zaheer","Rahul","Aryan","Sailesh");
		
		List<String> sortedName =names.stream().sorted().collect(Collectors.toList());
		
		sortedName.forEach(str -> System.out.println(str));
	}

}
