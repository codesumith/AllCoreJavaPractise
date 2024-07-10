package com.sumith.programs_string_method;

import java.util.Scanner;

public class StringContainsDigitOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.next();
		boolean isDigit=false;
		
		/*for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48&&str.charAt(i)<=57)
			{
				System.out.println("String contains digit");
				break;
			}
		}*/
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				isDigit=true;
				break;
			}
		}
		
		if(isDigit)
		{
			System.out.println("String contains digit");
		}
		else System.out.println("String does not contains digit");
		sc.close();
		
	}

}
