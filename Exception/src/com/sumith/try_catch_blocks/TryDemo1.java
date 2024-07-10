package com.sumith.try_catch_blocks;

public class TryDemo1 {

	public static void main(String[] args) {

		System.out.println("Main Started");

		try {
			
			// Explicitly creating an arithmetic exception object and throwing using throw
			
			throw new ArithmeticException("Dividing a number by zero");
			
		}

		catch (Exception e) {
			System.err.println(e);

		}

		System.out.println("Main Ended");
	}

}
