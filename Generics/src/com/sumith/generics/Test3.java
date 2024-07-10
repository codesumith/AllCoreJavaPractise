package com.sumith.generics;

import java.util.ArrayList;

public class Test3 {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>(); //generic type
		
		al.add("Ravi");
		al.add("Ajay");
		al.add("vijay");
		
		for(int i=0;i<al.size();i++)
		{
			String name =al.get(i);//no type casting required
			System.out.println(name.toUpperCase());
			
		}
	}

}
