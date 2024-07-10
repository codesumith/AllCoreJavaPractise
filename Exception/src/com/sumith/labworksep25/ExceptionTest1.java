package com.sumith.labworksep25;

public class ExceptionTest1 {
	public static void main(String[] args) {
		Exception e1 = new ArithmeticException("Number is divided by zero");
		System.out.println(e1);

		Exception e2 = new ArrayIndexOutOfBoundsException("Array is out of limit");
		System.out.println(e2);

	}
}