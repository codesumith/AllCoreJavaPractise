package com.sumith.arraysPractise;

import java.util.Arrays;

public class Remove_Duplicate_Elements_in_Array_And_Store_in_New_Array {

	public static void main(String[] args) {
		
		int [] arr=new int[] {1,3,4,6,6,8,8,9,10};
		int [] unique=new int [arr.length];
		int k=0;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			
			
		       if(arr[i]!=arr[i+1]) {
				unique[k]=arr[i];//1,3,4,
				k++;
			}
		}
		
		unique[k]=arr[arr.length-1];
		
		for(int i=0;i<=k;i++){
			System.out.print(unique[i]+" ");
		}
		System.out.println();
System.out.println(Arrays.toString(unique));
	}

}
