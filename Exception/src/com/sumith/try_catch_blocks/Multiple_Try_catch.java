package com.sumith.try_catch_blocks;

public class Multiple_Try_catch{

	public static void main(String[] args) {

		System.out.println("Main Started...");
		
		try
		{
			int a=100,b=0,c;
			c=a/b;  //new ArthemeticException();
			System.out.println("c value is : "+c);
		}

		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero problem....");
			e.printStackTrace();
		}
		System.out.println("....................");
		
		try
		{
			int x []= {12,90};
			System.out.println(x[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is out of limit...");
			System.out.println(e.getMessage());
		}
		System.out.println("Main method complted...");
	}

}
