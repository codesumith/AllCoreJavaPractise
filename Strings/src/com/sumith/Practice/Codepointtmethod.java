package com.sumith.Practice;

public class Codepointtmethod {
public static void main(String[] args) {
	
	String s="hyderbad";
	
	System.out.println(s.codePointAt(15));
	
	String s1="";
	for(int i=0;i<s.length();i++){
		s1+=(char)(s.charAt(i)-32);
	//s1+=(char)(s.codePointAt(i)-32);
	}
	
	System.out.println(s1);
}
}
