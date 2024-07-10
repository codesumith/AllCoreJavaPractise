package com.sumith.nov11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int as =sc.nextInt();
		int temp=as;
		int rev=0,rem;
       ArrayList<Integer> arr =new ArrayList<>(); 
		while(temp!=0)
		{
			rem=temp%10;
		    arr.add(rem);
			rev=rev*10+rem;
			temp=temp/10;
		}

		System.out.println(arr.size());
		
		int add=0;
		
		for(int i =0;i<arr.size()-1;i++)
		{
			System.out.println(arr.get(i));
			for(int j=1;j<=arr.size();j++)
			{
				int dup=arr.get(i);
			add+=dup*j;
			}
		}
		
		System.out.println(add);
		if(add==as)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("notarmstrong");
		}
		
		sc.close();
	}

}
