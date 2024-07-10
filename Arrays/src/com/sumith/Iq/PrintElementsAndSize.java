package com.sumith.Iq;

import java.util.Scanner;

public class PrintElementsAndSize{
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int size=sc.nextInt();
		int [] ar=new int[size];
		
		
		
		
		for(int i=0;  i<ar.length;  i++) {
			
			System.out.println("Enter the element of index : "+i);
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Elements After Stroring in array : ");
		
		for (int i=0; i<ar.length; i++) {
			
			System.out.print(ar[i]+", ");
			
		}
		
		System.out.println();
		System.out.println("The length of array is :"+ar.length);
		sc.close();
		
	}
	
	
	
	
	
	
}