package com.sumith.classNotes;

public class ExceptionSuper {

	public static void main(String[] args) {
		
		Exception e1=new ArithmeticException();
		System.out.println(e1);

		Exception e2=new ArithmeticException("Dividing a number by 0");
		System.out.println(e2);
		
		Exception e3=new ArrayIndexOutOfBoundsException();
		System.out.println(e3);
		
		Exception e4 =new ArrayIndexOutOfBoundsException("Array index is out of bounds");
		System.out.println(e4);
	}

}
