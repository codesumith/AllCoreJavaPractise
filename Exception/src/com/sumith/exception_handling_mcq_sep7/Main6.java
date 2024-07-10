package com.sumith.exception_handling_mcq_sep7;

public class Main6 {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[10] = 15;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}