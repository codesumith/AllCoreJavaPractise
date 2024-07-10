package com.sumith.user_define_exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException
{
	public GreaterMarksException()
	{
		
	}
	
	public GreaterMarksException(String message)
	{
		super(message);
	}
}

public class UsetDefinedCheckedException {
	
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		Scanner sc =new Scanner(System.in);
		
		try(sc)
		{
			System.out.print("Enter yout marks : ");
			int marks =sc.nextInt();
			
			if(marks>100) {
				throw new GreaterMarksException("Marks is invalid");
			}
			else
				System.out.println("Your marks is : "+marks );
		}
		
		catch(GreaterMarksException e)
		{
			System.err.println(e);
		}
		
		System.out.println("Main ended");
	}

}
