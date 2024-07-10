package com.sumith.aug29;

import java.util.Scanner;

public class Lcm_of_Two_numbers_using_Recursion {
	
	public static int findLcm(int num1,int num2) {
		int maxNum = 0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0&&num2%i==0) {
				maxNum=i;
				
			}
		}
		System.out.println(maxNum);
		return findLcm(num1,num2,maxNum);
		
		
	}
	
	public static int findLcm(int num1,int num2,int maxNum) {
		
		 return (num1*num2)/maxNum;
		 
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number : ");int one=sc.nextInt();
		
		System.out.println("Enter Second number : ");int Second=sc.nextInt();
		
		System.out.println("Least common multiple is : "+findLcm(one, Second));
		
		sc.close();
	}

}
