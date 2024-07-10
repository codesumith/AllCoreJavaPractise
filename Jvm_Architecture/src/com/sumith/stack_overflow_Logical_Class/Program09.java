package com.sumith.stack_overflow_Logical_Class;


public class Program09 
{
public static void m1(int num) 
{
	
	if (num==0) 
	{
		return;
	}
	System.out.println(num);
	m1(num-1);
	System.out.println(num);
	
}
public static void main(String[] args) 
{
	 Program09.m1(4);
}
}
