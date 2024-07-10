package com.sumith.sep6th_labwork;

public class NumberFormatExceptionDemo {

	public void checkException() {
		try {
			int num = Integer.parseInt("xyz");
			System.out.println(num);
		} 
		
		catch (NumberFormatException n) {
			
			System.out.println("Number Format Exception occured");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		var nfe=new NumberFormatExceptionDemo();
		nfe.checkException();
		
	}
}
