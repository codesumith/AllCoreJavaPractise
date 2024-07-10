package com.sumith.Test_sep2;

public class Single_Missing_element_in_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,13};
		
		int sum=0;
		int s=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			s+=i;
		}

		int missingElement=(sum-s)-1;
		
		System.out.println("The missing element in array "+missingElement);
		
	}

}
