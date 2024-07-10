package com.sumith.static_block;
class Demo1 
{
    static 
	{   
		i = 10;
       //System.out.println(i); //We can't access before declaration
    }

    static int i;
}

public class StaticBlockDemo5
{

    public static void main(String[] args) 
	{
        new Demo();
	}
}