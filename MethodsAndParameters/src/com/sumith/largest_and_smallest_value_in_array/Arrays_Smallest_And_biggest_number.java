package com.sumith.largest_and_smallest_value_in_array;

public class Arrays_Smallest_And_biggest_number {

	public static void main(String[] args) {
		
		int a[]= {10,44,39,90,25,99,34,6,35,10000};
		int large=a[0];
		int small=a[0];
		
		for(int i=1;i<10;i++) {
			if(a[i]>large) {
				large=a[i];
			}
			else if(a[i]<small) {
				small=a[i];
			}
			
		}
		System.out.println("Smallest number Of array is"+small);
System.out.println("Biggest number Of array is"+large);
	}

}
