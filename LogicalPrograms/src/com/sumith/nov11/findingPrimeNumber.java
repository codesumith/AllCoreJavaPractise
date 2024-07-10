package com.sumith.nov11;

import java.util.Scanner;

public class findingPrimeNumber {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	
	int n,flag=0;
	
	System.out.println("Enter a number:");
	n=sc.nextInt();
	
	if(n==1||n==0)
	{
	 flag+=1;	
	}
	for(int i =2;i<=n-1;i++)
	{
		if(n%i==0||n==1||n==0)
		{
			flag+=1;
		}
	}
	
	if(flag==0)
	{
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
	sc.close();
	}
	
}
