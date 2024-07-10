package com.sumith.ways_to_load_class_in_jvm;


class Test
{
	static 
	{
		System.out.println("Static block of Test class");
	}
}

public class By_Reflection_Api 
{
	
public static void main(String[] args) throws Exception
{
	
Class.forName("com.sumith.ways_to_load_class_in_jvm.Test");	

}
 

}
