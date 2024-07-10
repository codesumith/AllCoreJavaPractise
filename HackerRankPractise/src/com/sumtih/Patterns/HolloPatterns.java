package com.sumtih.Patterns;

public class HolloPatterns {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==3&&j==2||i==4&&j==2||i==4&&j==3)
					System.out.print("  ");
				else
				System.out.print("* ");
			}
			System.out.println();
		}
		
        System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=5;k>=i;k--)
			{
				if(i==2&&k==4||i==2&&k==3||i==3&&k==4)
					System.out.print("  ");
				else
				System.out.print("* ");
			}
			
			 System.out.println();
		}
		
        System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				       if(i==2&&j==3||i==2&&j==4
						||i==3&&j==2||i==3&&j==4
						||i==4&&j==2||i==4&&j==3)
					System.out.print("  ");
				else
				System.out.print("* ");
			}
			
			
			System.out.println();
		}
		
		 System.out.println();
		 
		 for (int i = 1; i <= 4; i++) {
			    for (int j = 1; j <= 4; j++) {
			        if (i == j || j == 5 - i) {
			            System.out.print("* ");
			        } else {
			            System.out.print("  ");
			        }
			    }
			    System.out.println();
			}


		
	}

}
