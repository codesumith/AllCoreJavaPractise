package com.sumith.july7th;


public class GCD 
{
	
	public static void main(String[] args) 
	{
		
		int a= Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int greatest=0;
		if(a<0||b<0)
		{
			System.out.println(-1);
		}
		else {
			for(int i=1;i<=b;i++) 
		{
			if(a%i==0&&b%i==0) 
			{
				 greatest=i;
				
		    }
			
		}
		System.out.println( greatest);	
		}
   }
}