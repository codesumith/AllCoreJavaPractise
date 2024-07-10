package com.sumith.july7th;

import java.util.*;


public class AverageAndSumOf5Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 Numbers");
int number1=sc.nextInt();
int number2=sc.nextInt();
int number3=sc.nextInt();
int number4=sc.nextInt();
int number5=sc.nextInt();

int sum=number1+number2+number3+number4+number5;
double average=sum/5;
System.out.println("The sum of 5 no is :"+sum);
	System.out.println("The Average is :"+average);	
	sc.close();
	}

}
