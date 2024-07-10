package com.sumith.Test_sep23;

public class Snippet2 {

	public static void main(String[] args) {

		try 
		{
//			String str = null;
//			System.out.println(str.length());
		} 
		catch (NullPointerException e) {
			System.out.println("NullPointerException!");
		} 
		catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}
