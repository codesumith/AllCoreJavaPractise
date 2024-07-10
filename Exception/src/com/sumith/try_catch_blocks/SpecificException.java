package com.sumith.try_catch_blocks;

public class SpecificException {

	public static void main(String[] args) {

		try {
			int[] a = { 12, 23, 34, 45 };
			System.out.println(a[4]);// new ArrayIndexOutOfBoundsException();
			System.out.println("Inside try");
		} catch (ArrayIndexOutOfBoundsException e) // specific Exception class
		{
			System.out.println("Array is out of limit");

		}
		System.out.println("Main is completed");

	}

}
