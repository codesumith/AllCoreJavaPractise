package com.sumith.exceptionPropagation;

public class ReturnExample {
	
	public static void main(String[] args) {
		
		System.out.println(methodReturningValue());
		
	}
	
	public static int methodReturningValue() {
		try
		{
			System.out.println("Try Block");
			System.out.println(10/0);
			return 15;
		}
		catch(Exception e ) {
			System.out.println("catch block");
			return 15;
			
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
	}

}
