package com.sumith.Test_sep23;

public class Snippet4 {
	public static void main(String[] args) {

		try {
			throw new NullPointerException();
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception!");
		} 
		catch (NullPointerException e) 
		{
			System.out.println("NullPointerException!");
		}
	}
}
