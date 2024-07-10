package com.sumtih.Patterns;

public class Traingle {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int row=1;row<n;row++)
		{
			
			for(int col=1;col<n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n2-------------------\n");
		
		for(int row=1 ;row<n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n3-------------------\n");
		
		for(int row =n;row>1;row--) //4
		{
			for(int col=1;col<row;col++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n4-------------------\n");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n5-------------------\n");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\npractise-------------------\n");
		
		for(int i=n;i>1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\npractise-------------------\n");
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
			System.out.println("\nTriangle-------------------\n");
			
			for(int i=1;i<n;i++)//1 2 3 4
			{
				for(int k=5;k>i;k--)
				{
				System.out.print(" ");	
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
	        }
			
			
		}
	}



/*
 * * * *
 * * *
 * 
*/