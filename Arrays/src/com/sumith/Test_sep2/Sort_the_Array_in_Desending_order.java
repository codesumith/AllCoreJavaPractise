package com.sumith.Test_sep2;

import java.util.Arrays;

public class Sort_the_Array_in_Desending_order {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(" Array before soring : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			}
		}
		
		System.out.println(" Array in desending order :"+Arrays.toString(arr));
		
	}

	
}
