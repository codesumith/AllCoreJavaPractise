package com.sumith.Practice;

public class Palindrome {
	public static void main(String[] args) {
		
		String s="MAM".toLowerCase();
		String rev="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev+=s.charAt(i);
			
		}
		
		
		if(rev.equals(s)) {
			System.out.println("Palindrome");
		}
		else System.out.println("Not a palindrome");
	}

}
