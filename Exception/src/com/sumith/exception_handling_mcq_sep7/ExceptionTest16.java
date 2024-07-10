package com.sumith.exception_handling_mcq_sep7;

public class ExceptionTest16 {
	public static void main(String[] args) {
		int ary[] = new int[2];
		ary[10] = 5;
		try {
			//int number = 2 / 0;
		} catch (Exception e) {
			System.out.println("Divide by Zero");
		} finally {
			System.out.println("Inside FINALLY block");
		}
	}
}