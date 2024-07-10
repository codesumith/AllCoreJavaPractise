package com.sumith.Test_sep2;



public class Finding_Frequency_of_Array {

	public static void main(String[] args) {
		
		int[] arr= {1,8,1,3,5,5};
		int count;
		
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
					count++;
				}
			}
			if(arr[i]!=-1) {
				System.out.println("Frequency of "+arr[i]+" is : "+count);
			}
		}

	}

}
