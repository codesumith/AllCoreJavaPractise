package com.sumith.palindrome_string;

import java.util.Scanner;

public class palindrome {
	String s="";
	String org_str;
	public void palindromeString() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String:");
		String str=sc.nextLine();
		org_str=str;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			s=c+s;
			
			
		}
		
		//System.out.println(s);
		if(org_str.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
			sc.close();
		}
		
	
	

}
