package com.sumith.Practice;

public class ConvertingAllStringintoUpperCase {

	public static void main(String[] args) {
		String s="hyderabad";
		String s1="";
		char ch;
		
	for(int i=0; i<s.length();i++) {
		ch=s.charAt(i);
		if(ch>96&&ch<123) {
		ch=(char)(ch-32);
	s1+=ch;
		}
	}
System.out.println(s1);
	
	
	}

}
