package com.sumith.TestOct14;

import java.util.ArrayList;

public class JoinTwoArrays {

	public static void main(String[] args) {
		
ArrayList <String>al1=new ArrayList<>();
		
		al1.add("Red");
		al1.add("Green");
		al1.add("Black");
		al1.add("White");
		al1.add("Pink");
		
ArrayList <String>al2=new ArrayList<>();
		
		al2.add("Red");
		al2.add("Green");
		al2.add("Black");
		al2.add("Pink");	
		
		ArrayList <String>al3=new ArrayList<>();	
		
		al3.addAll(al1);
		al3.addAll(al2);
		
		System.out.println(al3);

	}

}
