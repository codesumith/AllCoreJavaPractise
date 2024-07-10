package com.sumith.try_catch_blocks;

public class Multiple_catch_blocks_in_single_try {

	public static void main(String[] args) {

		System.out.println("Main Started : ");

		try 
		{

			int a = 10, b = 2, c;
			c = a / b;

			System.out.println("c value is :" + c);

			int x[] = { 12, 34, 67 };
			System.out.println(x[2]);

		} 
		
		catch (ArrayIndexOutOfBoundsException e1) 
		{

			System.err.println("Array is out of limit..... ");

		}

		catch (ArithmeticException e1) 
		{
			System.err.println("Divide by zero problem.....");
		} 
		
		catch (Exception e) 
		{
			System.out.println("General");
		}

		System.out.println("Main ended....");
	}

}
