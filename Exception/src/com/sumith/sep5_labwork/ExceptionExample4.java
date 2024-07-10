package com.sumith.sep5_labwork;

public class ExceptionExample4 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("abc");
			System.out.println("The number is: " + num);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occurred.");
		} finally {
			System.out.println("End of program.");
		}
	}
}