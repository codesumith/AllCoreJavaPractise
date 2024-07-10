package com.sumith.aug25Arrays;

import java.util.Scanner;

public class DuplicateElemnts {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter how many elements you want to store in Array  : ");
		int store=sc.nextInt();
		int count=0;
		int[] arr5=new int[store];
		  System.out.println("________________________________________________________________________________________ ");
	  		
		for(int i=0;i<arr5.length;i++) {
			System.out.print("Enter array Element of "+i+" Index : ");
			arr5[i]=sc.nextInt();
		}
		
		  System.out.println("________________________________________________________________________________________ ");
	  		
		for(int i=0;i<arr5.length;i++) {
			
			for(int j=i+1;j<arr5.length;j++) {
				
				if(arr5[i]==arr5[j]) {
					count++;
					
				}
				
			}
			
		}
		System.out.println("Total Number of dublicate elements found in array are : "+count);
		
		  
		
		sc.close();
	}

}
