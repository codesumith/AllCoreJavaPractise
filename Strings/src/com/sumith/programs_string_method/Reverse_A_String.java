package com.sumith.programs_string_method;

import java.util.Scanner;

public class Reverse_A_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to reverse : ");
		String str = sc.next();

		
		System.out.print("Given string in reverse : ");
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		//Using predefined method
		
		System.out.print("Enter a string to reverse : ");
		String str1 = sc.next();
		
		
		StringBuilder sb1= new StringBuilder();
		sb1.append(str1);
		System.out.println("Given string in reverse : "+sb1.reverse());
		System.out.println(sb1);
		sc.close();
	}

}
