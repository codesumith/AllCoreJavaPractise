package com.sumith.sep6th_labwork;

public class StringIndexOutOfBoundsExceptionDemo {
	
	
	public void checkException() {
		
		try {
			String str ="Hello World";
			System.out.println(str.length());
			char c=str.charAt(0);
			c=str.charAt(40);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException str) {
			System.out.println("String index out of bounds exception  !");
		}
	}

	public static void main(String[] args) {
		var sie=new StringIndexOutOfBoundsExceptionDemo();
		sie.checkException();
	}
}
