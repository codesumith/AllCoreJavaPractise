package com.sumith.ways_to_load_class_in_jvm;

class A
{
static 
{
	  System.out.println("Static Block of Super class A !!");
}

}

class B
{
	static 
	{
      System.out.println("Static Block of Sub class B !!");
	}

}

public class By_using_Inheritance 
{
	
	public static void main(String[] args) 
	{
		new B();
	}
	
}
