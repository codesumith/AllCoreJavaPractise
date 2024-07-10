package com.sumith.Test_sep23;

public class Program15 {
	public static void main(String args[]) {
		int i;
		try {
			i = calculate(8, 2);
			System.out.println(i);
			
		} catch (Exception e) {
			System.out.println("Error occured");
		}
	}

	static int calculate(int a, int b) {
		
		a /= b *= b += b;
		return a;
	}
}
