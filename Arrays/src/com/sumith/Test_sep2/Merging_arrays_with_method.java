package com.sumith.Test_sep2;

import java.util.Arrays;

public class Merging_arrays_with_method {
	
	public static int[] mergeTwoArrays(int[] arr,int[] arr1) {
		
		int []meg = new int[arr.length+arr1.length];
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			
			meg[k]=arr[i];
			k++;
			
		}
		
         for(int i=0;i<arr1.length;i++) {
			
			meg[k]=arr1[i];
			k++;
			
		 }
         
         return meg;
		}
		

	public static void findMissingElements(int [] arr) {
		int k=0;
		
		System.out.print("The missing Element is : ");
		
		for(int i=arr[0];i<arr[arr.length-1];i++) { 
			
			
			if(arr[k]!=i) {
				System.out.print(i+" ");
				i++;
			}
			++k;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5};
		
		System.out.print("1st Array : "+Arrays.toString(arr));
		
		System.out.println();
		
		System.out.println("------------------------------------------------------------");
		
		
		int []arr1= {7,8,9,10};
		
		System.out.print("2nd Array : "+Arrays.toString(arr1));
		
		System.out.println();
		
		System.out.println("------------------------------------------------------------");
		
		
		int []merge = new int[arr.length+arr1.length];
		
		merge=mergeTwoArrays(arr, arr1);
		
		System.out.println("After merging Arrays : "+Arrays.toString(merge));
		
		System.out.println("------------------------------------------------------------");
		
		findMissingElements(merge);

	}

}
