package com.sumith.exam_mcqaug26;
public class Ex1 {
	int a=10;
	static {
		System.out.print("SB ");
	}
	{
		System.out.print(" NSB");
	}
	Ex1(){
		System.out.print(" Const ");
		System.out.print(new Ex1().a);
	}
	public static void main(String[] args) {
		new Ex1();
	}
		
}