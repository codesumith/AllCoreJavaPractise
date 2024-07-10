package com.sumith.static_block;
class Foo1
{	
	static int x;
    static
	{		
		System.out.println("x value is :"+x);
	}
}

public class StaticBlockDemo2 
{
	public static void main(String[] args) 
	{
		 new Foo1();
	}
}

//All static data members are initailzed with default values