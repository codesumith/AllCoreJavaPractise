package com.sumith.static_block;
class Test
{
	static int x;

	static
	{
		x = 100;
		System.out.println("x value is :"+x); //Static blocks are executed according to the order.
                                              //[top to bottom]
	}
	
	static
	{
		x = 200;
		System.out.println("x value is :"+x);
	}

	static 
	{
		x = 300;
		System.out.println("x value is :"+x);
	}

	static
	{
		x = 400;
		System.out.println("x value is :"+x);
	}
}
public class StaticBlockDemo1   
{
	public static void main(String[] args) 
	{
		System.out.println(Test.x);
	}
}