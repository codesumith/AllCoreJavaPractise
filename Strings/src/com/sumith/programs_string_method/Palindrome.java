package com.sumith.programs_string_method;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string : ");
String str=sc.next();

/*String rev="";

for(int i=str.length()-1;i>=0;i--)
{
	rev+=str.charAt(i);
}

if(rev.equalsIgnoreCase(str)) System.out.println(str+" is a palindrome.");

else System.out.println(str+" is not a palindrome.");*/

boolean isPalindrome =true;

for(int i=0;i<str.length() /2;i++)
{
	if(str.charAt(i)!=str.charAt(str.length()-i-1))
	{
		isPalindrome=false;
		break;
	}
}

if(isPalindrome) System.out.println(str+" is a palindrome.");

else System.out.println(str+" is not a palindrome.");
 
sc.close();

	}

}
