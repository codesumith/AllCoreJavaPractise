package com.sumith.labwork_sep22;

import java.util.Scanner;

public class MyProgram3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();
		
		char [] ch=str.toCharArray();

	//	String[] str1 = str.split(" ");

		int count =1;
		
		if(ch[0]==32) count--;
		
		for(int i=0;i<ch.length-1;i++)
		{
			
			if(ch[i]==32&&ch[i+1]>=65)
			{
				count++;
			}
		}

		
		

//		for (String s : str1) {
//
//			if (s != "")
//				count++;
//
//		}

		System.out.println("No of words in the given string is :" + count);

		sc.close();
	}
}