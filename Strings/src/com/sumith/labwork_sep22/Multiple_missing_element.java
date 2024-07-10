package com.sumith.labwork_sep22;

public class Multiple_missing_element {
	
	public static void main(String[] args) {
		
		int [] arr= {1,2,4,7};
		
		int num=arr[0];
		
		System.out.print("Misssing numbers are : ");
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=num)
			{
				i--;
				System.out.print(num+" ");
			}
			num++;
		}
		
	}

}
