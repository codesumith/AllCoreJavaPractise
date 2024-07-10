package com.sumith.test_programs_sep23;

import java.util.Scanner;

public class MaximumOcuurenceOfACharacterInGivenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		
		int min=0;
		int max=0;
		char ch = 0;
		
		for(int i=0;i<str.length();i++)
		{
			min=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					min++;
				}
			}
			if(min>max)
			{
				ch=str.charAt(i);
				max=min;
			}
		}

		System.out.println(ch+" is the maximum occurance character.");
		
		sc.close();
	}

}
