package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterMethod {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
		//retrieve all even numbers from list without stream ApI;
		List<Integer> evenNumbers = new ArrayList<>();
		for(Integer i : list)
		{
			if(i%2==0)
			{
				evenNumbers.add(i);
			}
		}
		
		evenNumbers.forEach(System.out::println);
		
		
		//retrieving all even numbers with streamApi;
		
		evenNumbers.clear();
		
		
		list.stream().filter(num -> num%2==0).forEach(System.out::println);;
	}

}
