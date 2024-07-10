package com.sumith.static_block;
class Foo
{
	Foo()
	{
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static
	{
		System.out.println("Static block...");
	}
}
public class StaticBlockDemo 
{
	public static void main(String [] args)
	{   
		System.out.println("Main Completed...");		
	}
}
/*Here only StaticBlockDemo.class file will be loaded 
  but Foo.class file will not be loaded that means 
  automatically the classes will not be loaded into JVM memory

 */
