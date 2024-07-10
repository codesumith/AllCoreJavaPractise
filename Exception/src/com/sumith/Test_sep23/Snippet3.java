package com.sumith.Test_sep23;

public class Snippet3 {

	public static void main(String[] args) {

		try 
		{
//			int[] arr = new int[5];
//			int value = arr[2];
		} 
		catch (NullPointerException e) 
		{
			System.out.println("NullPointerException!");
		} 
		finally 
		{
			System.out.println("Finally Block!");
		}
	}
}
