package com.sumith.generics;

import java.util.ArrayList;

public class Test2 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("alpha");
		al.add("beta");
		
		for(int i=0;i<al.size();i++)
		{
			String str=(String)al.get(i);
			System.out.println(str);
		}
		
		al.add(1234);
		al.add(1456);
		
		for(int i=0;i<al.size();i++)
		{
			String obj=(String)al.get(i); //we can't perform type casting here
			System.out.println(obj);
		}
		
		
	}

}
