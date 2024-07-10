package com.sumith.programs_string_method;

import java.util.Scanner;

public class StringContainsVowelsOrNot {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string : ");
String str=sc.nextLine();

boolean containsVowels = false ;

for(char c:str.toLowerCase().toCharArray())
{
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		containsVowels=true;
		break;
	}
}

if(containsVowels)
{
	System.out.println("The string contains vowels.");
}
else
{
	System.out.println("The string does not contain vowels.");
}
sc.close();
	}

}
