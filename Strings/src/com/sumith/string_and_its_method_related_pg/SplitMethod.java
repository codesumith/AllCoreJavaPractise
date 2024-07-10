package com.sumith.string_and_its_method_related_pg;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String s1="Hyderabad is a nice city";
		String [] words=s1.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		String s2="Hyderabad is a nice city";
		words=s2.split("e");
		
		System.out.println(Arrays.toString(words));
		
		for(String word : words) {
			
			System.out.println(word);
			
		}

	}

}
