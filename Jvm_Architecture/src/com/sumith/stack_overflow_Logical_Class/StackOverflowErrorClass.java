package com.sumith.stack_overflow_Logical_Class;


public class StackOverflowErrorClass {
	static int i = 0;

	public static int printNo(int a)
	{

		a = a + 2;
		System.out.println(a);
		return a + printNo(a + 2);
	}

	public static void main(String[] args)
	{
         StackOverflowErrorClass.printNo(1);
	}
}