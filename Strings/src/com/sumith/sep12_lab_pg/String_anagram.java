package com.sumith.sep12_lab_pg;

import java.util.Scanner;

public class String_anagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st word :");
		String word1=sc.next();
		
		System.out.println("-------------------------------");
		
		System.out.println("Enter the 2nt word :");
		String word2=sc.next();
		
		int compare=0;
		
		if(word1.length()==word2.length())
		{
			for(int i=0;i<word1.length();i++)
			{
				for(int j=0;j<word2.length();j++)
				{
					if(word1.charAt(i)==word2.charAt(j)) {
						compare++;
						break;
					}
				}
			}
			
			if(compare==word1.length())
			{
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not a anagram");
			}
		}
		else {
			System.out.println("Not a anagram");
		}
sc.close();
	}

}
