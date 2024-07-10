package com.sumith.Even_Or_odd;

public class EvenOrOdd {

	public  boolean isEven (int num) {
		 
		boolean result= num%2==0?true:false;
		if(result==true)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		return result;
	
	}
}
