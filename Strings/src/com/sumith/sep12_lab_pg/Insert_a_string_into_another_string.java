package com.sumith.sep12_lab_pg;

import java.util.Scanner;

public class Insert_a_string_into_another_string {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String OriginalString ="Hello, world!";
		System.out.println("Orginal String :"+OriginalString);
		
		System.out.println();
		
		String StringToInsert ="Java";
		System.out.println("String to insert :"+StringToInsert);
		
		System.out.println();
		
		
		System.out.print("Enter index no where you want to insert the String : ");
		int num=sc.nextInt();
		
		String resultString=new String();
		
		
		for(int i=0;i<OriginalString.length();i++)
		
		{
			if(i==num)
			{
				resultString+=" ";
				resultString+=StringToInsert;
				resultString+=" ";
			}
			else
			{
				resultString+=OriginalString.charAt(i);
			}
			
		}

		System.out.println("Resulting String :"+resultString);
		
		sc.close();
	}

}
