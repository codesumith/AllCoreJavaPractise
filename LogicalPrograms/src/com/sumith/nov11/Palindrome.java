package com.sumith.nov11;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int no=44;
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0)
		{
			rem=temp%10;//4,5,4
			rev=rev*10+rem;//4,45,454
			temp=temp/10;//45,4,0
		}
		
		if(rev==no)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
	

}
