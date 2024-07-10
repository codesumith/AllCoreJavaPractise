package com.sumith.final_keyword;
class A1
{
	protected int a = 10;
	protected int b = 20;

     public  void calculate()
	  {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	  } 
}
class B extends A1
{	
	public void calculate() //error
	{
		int mul = a*b;
		System.out.println("Mul is :"+mul);	
	}
}
public class FinalMethod 
{
	public static void main(String [] args) 
	{
		 A1 a1 = new B();
		 a1.calculate();
	}
}
