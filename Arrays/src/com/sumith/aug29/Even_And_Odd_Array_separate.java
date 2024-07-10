package com.sumith.aug29;

import java.util.Scanner;


public class Even_And_Odd_Array_separate {
	
	public static int[] getEvenElements(int [] arr) {
		
		int []even= new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[k]=arr[i];
				k++;
			}
		}
		
		System.out.println("Number of Even Elemnts are : "+k);
		System.out.print("Even Elements are : ");
		
		
		
		return even;
		
	}



	public static int []getOddElements(int [] arr) {
		
		int []odd= new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				odd[k]=arr[i];
				k++;
			}
		}
		System.out.print("Number of Odd Elemnts are : "+k);
		System.out.println();
		System.out.print("Odd Elements are : ");
		
		
		
		return odd;
		
		
		
		
	}
	
	public static void print(int[] arr) {
		

		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				
    System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the size of the Array : ");int size=sc.nextInt();
	
	System.out.println("---------------------------------------------------");
	
	int [] arr=new int [size];
	
	for(int i=0;i<arr.length;i++) 
	{
		System.out.print("Enter thr array element of "+ i + " Index : "); arr[i]=sc.nextInt();
	}
	
	System.out.println("---------------------------------------------------");
	
	System.out.print("Array Elemnts are :");
	 for(int num :arr) 
	 {
		 System.out.print(num+" ");
	 }
	
	 System.out.println();
	 System.out.println("---------------------------------------------------");
	int [] even=getEvenElements(arr);
	print(even);
	
	System.out.println();
	System.out.println("---------------------------------------------------");
	int [] odd=getOddElements(arr);
	print(odd);
	
	sc.close();
	}
}
