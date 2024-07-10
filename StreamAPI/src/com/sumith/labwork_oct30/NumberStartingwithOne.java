package com.sumith.labwork_oct30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingwithOne {
	
	public static void main(String[] args) {
	
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		List<Integer> startsWith1= myList.stream().filter(i -> i>9&&i<20).collect(Collectors.toList());
		
		
		System.out.println(startsWith1);
	}

}
