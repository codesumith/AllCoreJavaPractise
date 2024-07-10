package com.sumith.aug25Arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int store;
		
		System.out.print("Enter how many elements to store in Array  : ");
		store=sc.nextInt();
		System.out.println("________________________________________________________________________________________ ");
		
		int arr2[]=new int[store];
		
		for(int i=0;i<store;i++) {
			
			System.out.print("Enter array element of "+i+" Index : ");
			arr2[i]=sc.nextInt();
			sum+=arr2[i];
		}
		System.out.println("________________________________________________________________________________________ ");
		
		System.out.println("Sum of elements stored in array is : "+sum);
		sc.close();
	}

}
