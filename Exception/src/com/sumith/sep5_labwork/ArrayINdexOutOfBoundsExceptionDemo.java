package com.sumith.sep5_labwork;

public class ArrayINdexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		int a[]=new int[2];
		try {
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" Array index out of limit ");
		}

	}

}
