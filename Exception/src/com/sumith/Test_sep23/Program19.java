package com.sumith.Test_sep23;

public class Program19 {
	@SuppressWarnings("finally")
	public static int m1() {
		
		try {
			int a = 10 / 0;
			
			return a;
		} catch (NullPointerException e) {
			return 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			return 20;
		} 
		finally 
		{
			return 30;
		}
	}

	public static void main(String args[]) {
		int result = Program19.m1();
		System.out.println(result);
	}
}