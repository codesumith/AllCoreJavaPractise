package com.sumith.sep9TestPrograming;

import java.util.Scanner;

public class IntegerInputVallidationandResourceCleanup {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.print("Enter a number : ");
			String num1=sc.next();
			
			int n=Integer.parseInt(num1);
			System.out.println("You have entered : "+n);
			
		}
		catch(NumberFormatException e) {
			System.err.println("Invalid Input please enter a valid integer");
		}
finally {
	sc.close();
}
	}

}
