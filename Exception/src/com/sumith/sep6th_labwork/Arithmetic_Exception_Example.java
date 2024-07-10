package com.sumith.sep6th_labwork;

public class Arithmetic_Exception_Example {
	
	public void checkException() {
		try {
			int num1=30,num2=0;
			int operation=num1/num2;
			System.out.println("Result : "+operation);
		}
		catch(ArithmeticException e) {
			System.out.println("you shouldn't divide a number by zero");
		}
	}

	public static void main(String[] args) {
		Arithmetic_Exception_Example a=new Arithmetic_Exception_Example();
		a.checkException();

	}

}
