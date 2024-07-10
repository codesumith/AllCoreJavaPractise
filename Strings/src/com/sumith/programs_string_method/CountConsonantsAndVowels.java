package com.sumith.programs_string_method;

import java.util.Scanner;

public class CountConsonantsAndVowels {

	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
System.out.print("Enter a String : ");
String str=sc.next().toLowerCase();

int constants=0, vowels=0;

for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);	
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowels++;
	
	else constants++;
}

System.out.println("Vowels : "+ vowels);
System.out.println("Constants : "+constants);
		
sc.close();
	}

}
