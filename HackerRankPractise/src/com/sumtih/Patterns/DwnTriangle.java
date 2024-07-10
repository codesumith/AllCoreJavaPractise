package com.sumtih.Patterns;

public class DwnTriangle {
	
	public static void main(String[] args) {
		System.out.println("\nDownwordsTriangle-------------------\n");
		
		int n =5;
		for(int i=1;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)//1 2 3 4
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
