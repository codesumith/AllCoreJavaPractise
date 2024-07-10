package com.sumith.nov11;

public class Neon {
	
	public static void main(String[] args) {
		
		int n =9;
		
		int mul=n*n;
		int rem=mul%10;
		int  q =mul/10;
		int add =rem+q;
		
		
		if(add ==n)
		{
			System.out.println("neon");
		}
		else
		{
			System.out.println("not neon");
		}
	}

}
