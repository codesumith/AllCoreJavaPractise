package com.sumith.TestOct14;

import java.util.ArrayList;

public class ReplaciingSecondElement {

	public static void main(String[] args) {
		
		ArrayList <String>al=new ArrayList<>();
		
		al.add("Red");
		al.add("Green");
		
		System.out.println("Array Elements are:"+al);
		
		al.set(1, "White");
		
		System.out.println("AfterReplacing :"+al);

	}

}
