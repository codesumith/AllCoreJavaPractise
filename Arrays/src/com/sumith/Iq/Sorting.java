package com.sumith.Iq;



public class Sorting {
	
	public static void main(String[] args) {
		
		int [] arr= new int []{-30,40,34,54,12,-87,32,66};
		
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int l=i+1;l<arr.length;l++) {
				
				if(arr[i]<=arr[l]) {
					int temp=arr[i];
					arr[i]=arr[l];
					arr[l]=temp;
					
				}
				
			}
			System.out.println(arr[i]);
		}
		
		
	}

}
