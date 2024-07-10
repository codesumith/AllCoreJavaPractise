package com.sumith.classNotes;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main method started....");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a=sc.nextInt();

		
		System.out.print("Enter the value of b : ");
		int b=sc.nextInt();
		
		int c=a/b;
		
		System.out.println("c value is :"+c);
		System.out.println("Main method ended..!!");
		sc.close();
	}

}
