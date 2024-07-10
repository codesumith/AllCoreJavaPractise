package com.sumith.programs_string_method;

import java.util.Scanner;

public class Count_The_Accourence_Of_Given_Character {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string : ");
String str=sc.next();

System.out.print("Enter the character to search for occurrence : ");
char ch=sc.next().charAt(0);

int count=0;

for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)==ch)
	{
		count++;
	}
}

System.out.println("The character ('"+ch+"') occurs "+count+" times.");

sc.close();
	}

}
