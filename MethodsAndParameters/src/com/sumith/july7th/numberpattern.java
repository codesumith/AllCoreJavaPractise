package com.sumith.july7th;

import java.util.Scanner;

public class numberpattern {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      System.out.print("enter number of rows:");
      int nr=sc.nextInt();
   
		for(int r=1;r<=nr;r++)
				{
			
			for(int c=1;c<=r;c++)
			{
				
				System.out.print(c*r+" ");
			}
			System.out.println();
				}
		sc.close();
	}

}
