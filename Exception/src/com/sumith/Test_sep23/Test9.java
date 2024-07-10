package com.sumith.Test_sep23;

public class Test9 {
	public static void main(String args[]) {
		int i;
		try {
			i = calculate();
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Error occured");
		}
	}

	static int calculate() {
		return (7 / 2);
	}
}