package com.sumith.Test_sep2;

public class Find_multiple_missing_Elements_in_Array {

	public static void main(String[] args) {
		
		int [] arr= {1,2,4,7};
		int k=0;
		
		System.out.print("The missing Element are : ");
		
		for(int i=arr[0];i<arr[arr.length-1];i++) {
			
			if(arr[k]!=i) {
				System.out.print(i+" ");
			}
			else
				k++;
		}

	}

}
