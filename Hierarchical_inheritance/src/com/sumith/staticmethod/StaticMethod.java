package com.sumith.staticmethod;
	
	class Super
	{
		public static void m1()
		{
			System.out.println("Super class m1 static method!!!");
		}
	}
	class Sub extends Super
	{	
		public static void m1()  //Method Hiding
		{
			System.out.println("Sub class m1 static method!!!");
		}
	}
	public class StaticMethod 
	{
		public static void main(String[] args) 
		{
			//Super s1 = new Sub();
			//s1.m1();
		}
	}


