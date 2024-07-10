package com.sumith.sep5_labwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		

try (sc){
	System.out.print("Enter a value :");int a=sc.nextInt();
	
	System.out.print("Enter b value :");int b=sc.nextInt();
	System.out.println(a);
	System.out.println(b);
}
catch(InputMismatchException e) {
	e.getMessage();
	e.printStackTrace();
	System.out.println("Enter number only");
	e.toString();
}
System.out.println("Main ended");
	}

}
