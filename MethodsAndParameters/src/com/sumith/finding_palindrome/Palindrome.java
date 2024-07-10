package com.sumith.finding_palindrome;

public class Palindrome {

	public static boolean getPalindrome(int number) {
		int number1=number;
		int rev=0;
		if(number>99&&number<=1000) {
			
		while(number1!=0) 
		{
		int reminder=number1%10;
		rev=rev*10+reminder;
		 number1=number1/10;
		}
		if(rev==number)
		{
			return true;
		}
		else 
		{
			
		}
	}
		return false;
}
	}

