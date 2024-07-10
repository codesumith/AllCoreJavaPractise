package com.sumith.Test_sep2;

import java.util.Arrays;

public class How_To_Rotate_Array {

	public static void main(String[] args) {
		
	int [] arr= {4,9,3,0,2};
	int k=0;
	
	System.out.println("Array before shifting : "+Arrays.toString(arr));
	
	System.out.println("------------------------------------------------------------");
	
	for(int i=arr.length-1;i>=(arr.length)/2;i--) { //2,0,9,4
		
		int temp=arr[i];
		arr[i]=arr[k];
		arr[k]=temp;
		k++;
		
		
		
	}
	System.out.println("Array after shifting : "+Arrays.toString(arr));
	}

}
