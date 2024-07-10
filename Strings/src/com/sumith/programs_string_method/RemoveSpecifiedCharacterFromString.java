package com.sumith.programs_string_method;


import java.util.Scanner;

public class RemoveSpecifiedCharacterFromString {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		
		System.out.print("Enter a character you want to remove : ");
		char removeChar =sc.next().charAt(0);
		
		StringBuilder result =new StringBuilder();
		
		for(char c:str.toCharArray())
		{
			if(c!=removeChar)
			{
			result.append(c);
			}
		}
		System.out.println(result);
		sc.close();
		
	System.out.println("--------------------");
	
	
	}

}
