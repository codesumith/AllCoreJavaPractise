package com.sumith.static_block;
class Demo2 
{
    static 
	{   
		i = 10; //before defining initialization is possible		
    }

    static int i;
}

public class StaticBlockDemo6
{

    public static void main(String[] args) 
	{
		System.out.println(Demo2.i);
	}
}