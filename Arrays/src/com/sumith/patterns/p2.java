package com.sumith.patterns;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class p2 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
					if(j==i)
					{
						for(int k=j;k<=5;k++)
						{
							System.out.print("* ");
						}
						break;
					}
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
		
		if(System.out.append(";")==null)
		{
			
		}
		
		List<String> al =Arrays.asList("A","B");
		
		System.out.println(al);
		
		StringJoiner sj =new StringJoiner(" ");
		
		for(String s: al)
		{
			sj.add(s);
		}
		System.out.println(sj);
		
		
		int arr[] = {1,3,4,5,6};
		
	     String s =Arrays.toString(arr);
	     
	     System.out.println(s);
	     
	 
	}
	

	static
	{
		System.out.println("HI");
	}

}
