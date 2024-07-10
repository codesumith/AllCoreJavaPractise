package com.sumith.programs_string_method;

import java.util.Scanner;

public class CountCapitalAndSmallLettersFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next();

		int countLower = 0;
		int countUpper = 0;

		for (int i = 0; i < str.length(); i++) 
		{
			     if (Character.isUpperCase(str.charAt(i))) countUpper++;

			else if (Character.isLowerCase(str.charAt(i))) countLower++;
		}

		System.out.println("UpperCase letters : " + countUpper);
		System.out.println("LowerCase letters : " + countLower);

		sc.close();
	}

}
