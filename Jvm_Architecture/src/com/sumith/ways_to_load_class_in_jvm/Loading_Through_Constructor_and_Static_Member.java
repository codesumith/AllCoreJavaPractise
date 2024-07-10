package com.sumith.ways_to_load_class_in_jvm;


class Demo
{
	static int x=10;
	static
	{
	 System.out.println("Static Block of Demo class Executed !!! : "+x);	
	}
}

public class Loading_Through_Constructor_and_Static_Member 
{
public static void main(String[]args)
{
	System.out.println("Main method Executed");
	//Demo d1=new Demo();//By using constructor
	System.out.println(Demo.x); // By accessing static data member
	

}
}
