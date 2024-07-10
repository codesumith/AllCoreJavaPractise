package com.sumith.Practice;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first word");
		String s1=sc.nextLine();
		System.out.println("Enter the second word");
		String s2=sc.nextLine();
		int compare=0;
		
		if(s1.length()==s2.length()) {
			
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						compare++;
						break;
					}
				}
			}
			if(compare==s1.length()) {
				System.out.println("Anagram");
			}
			else System.out.println("Not anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
		sc.close();
	}

}
