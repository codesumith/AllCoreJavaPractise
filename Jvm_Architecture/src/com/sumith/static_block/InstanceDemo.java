package com.sumith.static_block;
class Demo
{
	 final int a;	//blank final variable

	public Demo()
	{		
		a = 10;
		System.out.println(a);
	}
	
	public Demo(int x)
	{
		a = x;
		System.out.println(x);
	}

}	
public class  InstanceDemo
{
	public static void main(String[] args) 
		{
		
	         // Demo d1 = new Demo();	

	         // Demo d2 = new Demo(15);
	          
	    }
}