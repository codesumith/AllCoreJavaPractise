package com.sumith.labWork_sep15;
import java.util.Scanner;

public class PrintAndCountAllDuplicateCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the input =");
		String str = sc.nextLine();
		//Occurrence of each character : 
		System.out.println("Occurence of each character :");
		for(int i = 32;i<=122 ; i++) {
			int c=0;
			for(int j=0;j<str.length();j++) {
				if(i==str.charAt(j)) c++;
			}
			if(c>0) System.out.println("Charater is "+(char)i+ " "+ c + " times");
		}
		
		//For sorting in ascending order 
		System.out.println("Sorting in ascending order :");
		String res="";
		for(int i = 32;i<=122 ; i++) {
			for(int j=0;j<str.length();j++) {
				if(i==str.charAt(j)) res+=str.charAt(j);
			}
		}
	System.out.println("Result is :"+res);
	
	//unique char and  count
	System.out.println("Unique characters and their count :");
	for(int i = 32;i<=122 ; i++) {
		int c=0;
		for(int j=0;j<str.length();j++) {
			if(i==str.charAt(j)) c++;
		}
		if(c==1) System.out.println("Charater is "+(char)i+ " "+ c + " times");
	}
		
	//Duplicate char and  count
		System.out.println("Duplicate characters and their count :");
		for(int i = 32;i<=122 ; i++) {
			int c=0;
			for(int j=0;j<str.length();j++) {
				if(i==str.charAt(j)) c++;
			}
			if(c>1) System.out.println("Charater is "+(char)i+ " "+ c + " times");
		}
		System.out.println("Check vowel or not :");
		int count = 0; 
			for(int j=0;j<str.length();j++) {
				if(str.toLowerCase().charAt(j)=='a' ||str.toLowerCase().charAt(j)=='e' ||str.toLowerCase().charAt(j)=='o' ||
						str.toLowerCase().charAt(j)=='i'||str.toLowerCase().charAt(j)=='u'  ) {
					count++;
					break;
			}
			
		}
			if(count==1) System.out.println("yes vowel is present");
			else 
				System.out.println("No vowel present");
		
		//Remove user entered character all occurrence
		System.out.println("Remove one charater all occurrence :");
		String result="";
		for(int i = 32;i<=122 ; i++) {
			//int c=0;
			for(int j=0;j<str.length();j++) {
				if(i==str.charAt(j)&&i!='o') result+=str.charAt(j);
			}
		}
		System.out.println("Result is :"+result);
		sc.close();
	}

}