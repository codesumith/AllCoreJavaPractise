package com.sumith.sep9TestPrograming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PredefinedExceptionHandling {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			
		System.out.print("Enter first no : ");int num1 =sc.nextInt();
		
		System.out.print("Enter second no : ");int num2 =sc.nextInt();
		System.out.println("-----------------------------------------");
		
		double result=num1/num2;
		
		System.out.print("Result of division is :"+result);
		
		}
		catch (ArithmeticException e)
		{
		System.out.println("ArithmeticException occured : Divison by zero is not allowed.");		
		}
		catch( InputMismatchException e)
		{
			System.out.println("InputMismatchException occured : Please enter a valid integers");
		}
		finally
		{
		sc.close();	
		}

	}

}
