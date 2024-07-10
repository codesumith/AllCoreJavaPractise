package com.sumith.exception_handling_mcq_sep7;

public class ExceptionTest11 {
	public static void main(String[] args) {
		try {
			//int ary[] = { 10, 20, 30 };
			//int tempt = ary[4];
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		} catch (Exception e2) {
			System.out.println("Some exception");
		}
	}
}