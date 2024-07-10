package com.sumith.string_and_its_method_related_pg;

class Demo1
{
	static
	{
		System.out.println("STATIC BLOCK!!!");
	}
}

public class ForNameMethod {

	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("Demo1");

	}

}
