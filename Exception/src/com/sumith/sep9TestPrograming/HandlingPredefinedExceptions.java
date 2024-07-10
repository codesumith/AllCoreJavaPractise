package com.sumith.sep9TestPrograming;

import java.util.Scanner;

public class HandlingPredefinedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int [] arr= {10,20,30};
		try(sc) {
		
		
	
		
		System.out.print("Enter array index no :");int no1=sc.nextInt();
		
		System.out.println(arr[no1]);
		
		
        System.out.print("Enter array index no :");int no2=sc.nextInt();
		
		System.out.println(arr[no2]);
		
		
		try {
	    System.out.print("Enter array index no :");int no3=sc.nextInt();
		
		System.out.println(arr[no3]/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occured : Division by zero.");
		}
		
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException : Invalid index");
			
		}
	}

}
