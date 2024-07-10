package com.sumith.july7th;

import java.util.*;

public class NtermsOfOddNaturalNumberAndTheirSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input no of terms:");
		int number=sc.nextInt();
		int sum=0;
		System.out.println("The odd numbers are :");
		for(int i=1;i<=2*number;i+=2)
		{
			System.out.println(i);
			sum+=i;
		}
		
		System.out.println("The Sum of odd Natural Number upto "+ number+" terms is: "+sum);
		sc.close();
			}
			
		
		

	}


