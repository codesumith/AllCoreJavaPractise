package com.sumith.TestOct14;

import java.util.ArrayList;

public class ExtractPortionOfElements {

	public static void main(String[] args) {
		
ArrayList <String>al=new ArrayList<>();
		
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		
		System.out.println("Elements are:"+al);
		
		System.out.println("List of first three elements: "+al.subList(0, 3));

	}

}
