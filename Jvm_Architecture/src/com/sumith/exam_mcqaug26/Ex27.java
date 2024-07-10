package com.sumith.exam_mcqaug26;
public class Ex27 {

	
	public void print(long num1)
	{
		System.out.println("long");
	}
	public void print(Integer num1)
	{
		System.out.println("Integer");
	}
	public void print(int...num1 )
	{
		System.out.println("Var-Args");
	}
	
	
	public static void main(String[] args) {
		Ex27 test = new Ex27();
		test.print(5);
	}
}
