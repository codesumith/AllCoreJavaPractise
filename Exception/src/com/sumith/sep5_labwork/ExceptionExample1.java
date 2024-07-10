package com.sumith.sep5_labwork;

public class ExceptionExample1 {
	public static void main(String[] args) {
		try {
//			String str = null;
//			System.out.println(str.length());
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred.");
		} finally {
			System.out.println("End of program.");
		}
	}
}