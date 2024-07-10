package com.sumith.string_and_its_method_related_pg;

public class ToCharArrayMethod {

	public static void main(String[] args) {
	
		String str ="Java technology";
		
		char [] ch =str.toCharArray();
		
		
		
		for(char c : ch)
		{
			System.out.print(c);
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("String to character");
		System.out.println();
		String stri="ab";
		char ch1 =stri.charAt(0);
		char ch2 =stri.charAt(1);
		
		System.out.println(ch1+ ch2); //195
		
	}

}
