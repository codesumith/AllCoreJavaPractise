package com.sumith.generics;

import java.util.ArrayList;

public class Test1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
	
		
		for(int i=0;i<al.size();i++)
		{
			String name=(String) al.get(i);
			System.out.println(name.toUpperCase());
		}
		
		

	}

}
