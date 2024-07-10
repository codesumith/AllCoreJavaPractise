package com.sumith.TestOct14;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingElements {

	public static void main(String[] args) {
		
ArrayList <String>al=new ArrayList<>();
		
		al.add("Red");
		al.add("Green");
		al.add("Black");
		al.add("White");
		al.add("Pink");
		
		System.out.println("Before Swapping"+al);
		
		Collections.swap(al, 0, 2);
		
		System.out.println("After Swappinng :"+al);

	}

}
