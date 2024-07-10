package com.sumith.aug25Arrays;

import java.util.Scanner;

public class ReverseOFArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
    System.out.print("Enter how many values to store in array : ");
		int store=sc.nextInt();
		System.out.println("________________________________________________________________________________________ ");
		
		int[]arr1=new int [store];
		
		for(int i=0;i<store;i++) {
			System.out.print("Enter Array Element of "+i+" :");
			arr1[i]=sc.nextInt();
		}
		System.out.println("________________________________________________________________________________________ ");
		
        System.out.print("Array Elements are : ");

        for(int num : arr1) {
	      System.out.print(num+" ");
          }
        
		
            int temp=arr1[0];
        	arr1[0]=arr1[2];
        	arr1[2]=temp;
        	System.out.println();
        	System.out.println("________________________________________________________________________________________ ");
        	System.out.print("Array in Reverse are :");
        	
        	for(int num1 : arr1) {
       	      System.out.print(num1+" ");
                 }
        	
        	sc.close();
        }
	    }
	


