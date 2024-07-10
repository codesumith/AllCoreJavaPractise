package com.sumith.test_programs_sep23;

import java.util.Scanner;

public class StringisAnagramOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);     
		System.out.print("Enter 1st string :");
		String str1=sc.next();
		
		System.out.print("Enter 2nd string :");
		String str2=sc.next();
		
		int count=0;
		
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		
		if(count==str1.length()) System.out.println("Given strings are Anagram.");
		
		else System.out.println("Given strings are not Anagram.");
		
		sc.close();
	}

}
