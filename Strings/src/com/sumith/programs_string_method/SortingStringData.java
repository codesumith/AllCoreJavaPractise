package com.sumith.programs_string_method;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStringData {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str= sc.next();
		
		char [] chars =str.toCharArray();
		
		System.out.println("Before sortting : "+Arrays .toString(chars));
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(chars[i]>chars[j])
					
				{
					char temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
				}
			}
		}
		
		System.out.println("After sortting : "+Arrays .toString(chars));

		sc.close();
	}

}
