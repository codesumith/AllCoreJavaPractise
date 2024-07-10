package com.sumith.try_catch_blocks;

import java.util.Scanner;

public class TryDemo {

	public static void main(String[] args) {
		
		System.out.println("Main method Strated....");
		
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the valur of x : ");
			int x=sc.nextInt();
			
			System.out.println("Enter the valur of y : ");
			int y=sc.nextInt();
			
			int z=x/y;
			
			System.out.println("Z value is : "+z);
			System.out.println("Inside try block");
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
			System.err.println(e);
		}

		System.out.println("Main method ended....!!!");
		
		
	}

}
