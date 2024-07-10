package com.sumith.exception_handling_mcq_sep7;

public class ExceptionExample1 {
	public static void main(String[] args) {
		try {
			String str = "pic";
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred.");
		} finally {
			System.out.println("End of program.");
		}
	}
}