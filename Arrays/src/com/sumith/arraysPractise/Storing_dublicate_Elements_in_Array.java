package com.sumith.arraysPractise;

import java.util.Arrays;



public class Storing_dublicate_Elements_in_Array {

	public static void main(String[] args) {
		
		int [] arr= {1,4,5,7,9,10,20,4,1,9,};
		int []newArr=new int[arr.length];
		int k=0;
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));System.out.println();
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				newArr[k]=arr[i];
				k++;
			}
		}
		
		
		newArr[k]=arr[arr.length-1];
		
		for(int i=0;i<k;i++) {
			System.out.println(newArr[i]+" ");
		}
	}

}
