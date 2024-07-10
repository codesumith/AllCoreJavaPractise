package com.sumith.Test_sep23;

import java.io.FileNotFoundException;

class Dem0 {
	public void m1() throws FileNotFoundException {
		System.out.println("Dem0 class method");
	}
}

class Sample extends Dem0 {

	public void m1() {
		System.out.println("Sample class method");
	}
}

public class Program16 {
	public static void main(String[] args) {
		Dem0 d1 = new Sample();
		try {
			d1.m1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}