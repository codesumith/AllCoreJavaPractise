package com.sumith.stack_overflow_Logical_Class;
public class Program08 {
	Program08 p2=new Program08();

	{
		System.out.println("1st non static block");

	}

	int b = 20;

	Program08() {
		System.out.println("constructor executed");
	}

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		//Program08 p1 = new Program08();
	}

}