package com.sumith.exceptionPropagation;

public class ReturnExample1 {
	
	public static void main(String[] args) {
		try
		{
			methodReturningValue();
		}
		catch(Exception e)
		{
			System.out.println("Handled in main ");
		}
	}
		
		public static int methodReturningValue()
		{
			try
			{
				System.out.println("Try Block");
				System.out.println(10/0);
				return 10/0;
			}
			catch(Exception e)
			{
				System.out.println("catch block");
				return 10/0;
				
			}
			finally
			{
				System.out.println("Finally Block");
			}
		}
	}


