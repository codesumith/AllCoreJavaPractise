package com.sumith.patterns;

public class DaimondPattern {
	
	public static void main(String[] args) {
		
		int num=5;
		int j;
		for(int i=1;i<=num;i++)
		{
			for( j=1;j<=num;j++)
			{
				System.out.print(" ");
			}
			
				for(j=1;j<=i*2-1;j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
		
		
		
		}
	}


