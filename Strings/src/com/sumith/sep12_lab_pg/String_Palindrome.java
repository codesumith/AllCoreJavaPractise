package com.sumith.sep12_lab_pg;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String :");
		String word=sc.next();
		String wrd="";
		
		
		for(int i=word.length()-1;i>=0;i--)
		{
			wrd+=word.charAt(i);
		}
		
		if(word.equals(wrd))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}

		sc.close();
	}

}
