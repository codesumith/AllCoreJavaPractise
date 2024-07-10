package com.sumith.nov15;

import java.util.Scanner;

public class Prime1to100 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int p=s.nextInt();
		
	  int flag=0;
		
	  if(p==1||p==0)
	  {
		  flag=1;
	  }
	  else
	  {
		  for(int i=2;i<p;i++)
		  {
			  if(p%i==0)
			  {
				  flag=1;
				  break;
			  }
		  }
	  }
		
	  if(flag>0)
		  System.out.println(p+" is not prime number.");
	  else
		  System.out.println(p+" is prime number.");
	  
	 
	 
	  for(int i=2;i<=100;i++)
	  {
		  int count=0;
		 for(int j=2;j<i;j++)
		 {
			 if(i%j==0)
			 {
				 count++;
			 }
		 }
		 if(count==0)
		 {
			 System.out.print(i+" ");
		 }
	  }
	  
		s.close();
	}
	
}
