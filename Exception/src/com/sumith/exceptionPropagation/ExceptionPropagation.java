package com.sumith.exceptionPropagation;

public class ExceptionPropagation {

	public static void main(String[] args) {

		System.out.println("Main started ");
		try {
			m1();

		} catch (ArithmeticException e) {
			System.out.println("Handled in main");
		}
		System.out.println("Main Ended ");
	}

	public static void m1() {
		System.out.println("M1 started");
		m2();
		System.out.println("M1 Ended ");
	}

	public static void m2() {
		System.out.println("M2 started ");
		System.out.println(10 / 0);
	}
}
