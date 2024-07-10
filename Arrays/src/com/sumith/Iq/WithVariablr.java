package com.sumith.Iq;

import java.util.Scanner;

public class WithVariablr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int value;
		char choice;
		
		do {
			System.out.print("Enter the value you want to store");
			value=sc.nextInt();
			
			System.out.println("Enter your choice to enter more elements ");
			System.out.println("For yes y or Y");
			System.out.println("For no  n or N");
			choice=sc.next().charAt(0);
			
		}
		
		while(choice=='y' || choice=='Y');
		
		System.out.println("Your Stored element is :"+value);
		sc.close();
	}

}
