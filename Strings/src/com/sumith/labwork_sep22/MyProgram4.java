package com.sumith.labwork_sep22;

import java.util.Scanner;

public class MyProgram4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String str1 = sc.next();

		System.out.print("Enter Second string : ");
		String str2 = sc.next();
		
		
		System.out.println(str1.compareTo(str2));

		if (str1.length() != str2.length())
		{
			System.out.print(str1.length() - str2.length());
		}
		else 
		{
			for (int i = 0; i < str1.length(); i++) 
			{
				if (str1.charAt(i) != str2.charAt(i)) 
				{
					System.out.print(str1.charAt(i) - str2.charAt(i));
					break;
				} 
				
				else if (i == str1.length() - 1) 
				{
					System.out.print("0");
				}
			}

		}
		
	sc.close();	
	}
}