package com.sumith.try_catch_blocks;

public class MultyCatch1 {

	public static void main(String[] args) {
		
		System.out.println("Main method started!!!");
		
		try 
		{
			String str1="Sumith";
			System.out.println(str1.toUpperCase());
			
			String str2="nit";
			int x=Integer.parseInt(str2);
			System.out.println("Number is :"+x);
		}
		
		catch(NumberFormatException   | NullPointerException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Main method ended!!");
	}

}
