package com.sumith.wildcardcharacter;

import java.util.ArrayList;
import java.util.List;

public class Test14 {

	public static void main(String[] args) {
		
		try
		{
			
			List<Object> x =new ArrayList<>(); //Array of Object[java 9]
			x.add(10);
			
			x.add("Ravi");
			x.add("true");
			x.add("34.89");
			System.out.println(x);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
