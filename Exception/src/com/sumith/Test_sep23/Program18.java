package com.sumith.Test_sep23;

class Dem02 {
	void m1() throws ArithmeticException {
		System.out.println("Dem0 class method");

	}
}

class Sample2 extends Dem02 {

	public void m1() throws NullPointerException {
		System.out.println("Sample class method");
	}
}

public class Program18 {
	public static void main(String[] args) {
		Dem02 d1 = new Dem02();
		d1.m1();

	}
}
