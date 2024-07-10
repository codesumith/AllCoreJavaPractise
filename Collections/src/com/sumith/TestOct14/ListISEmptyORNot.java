package com.sumith.TestOct14;

import java.util.ArrayList;

public class ListISEmptyORNot {

	public static void main(String[] args) {
		
		ArrayList <String>al=new ArrayList<>();
		
		al.add("Red");
		al.add("Green");
		al.add("Black");
		al.add("White");
		al.add("Pink");
		
		System.out.println("IS array list empty :"+al.isEmpty());
		
		al.clear();
		
		System.out.println("IS array list empty :"+al.isEmpty());

	}

}
