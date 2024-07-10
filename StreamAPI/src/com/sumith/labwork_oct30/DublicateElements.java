package com.sumith.labwork_oct30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DublicateElements {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Set<Integer> dublicates =myList.stream().filter(i -> Collections.frequency(myList,i)>1).collect(Collectors.toSet());
		
		System.out.println(dublicates);
		
		
		
	}

}
