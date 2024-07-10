package com.sumith.aug25Arrays;

import java.util.Scanner;

public class CopyElementsFromOne_ArrayToAnotherArray {

	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
          
          System.out.print("Enter how many array elements you want store in Array : ");
          
          int store=sc.nextInt();
          
          System.out.println("________________________________________________________________________________________ ");
  		
          
          int arr3[]=new int[store];
          
          
          for(int i=0;i<store;i++) {
        	  System.out.print("Enter Array element of "+i+" Index : ");
        	  arr3[i]=sc.nextInt();
          }
          System.out.println("________________________________________________________________________________________ ");
  		
			System.out.print("The Elements stored in first Array is :");
			
			
			
			for(int num: arr3) {
				
				System.out.print(num+" ");
			}
			
			System.out.println();
			System.out.println("________________________________________________________________________________________ ");
			
			
			System.out.print("Elements stored in second array is : ");
			int[] arr4=new int[arr3.length];
			
			for(int i=0;i<arr4.length;i++) 
			{
			arr4[i]=arr3[i];
		    }
			
			for(int num:arr4) 
			{
				System.out.print(num+" ");
			}
			
			
			sc.close();
	}

}
