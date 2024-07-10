package com.sumith.exceptionPropagation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCathInsideCath {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter  your Roll number :");int roll =sc.nextInt();
			System.out.println("Your roll is :"+roll );
		}
		catch(InputMismatchException e)
		{
			
			System.err.println(" Provide Valid input !!");
			
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Divide by zero problem ");
			}
		}

	}

}
