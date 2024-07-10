package com.sumith.programs_sep1;

public class Count_Frequency_Of_EachElemnt {

	public static void main(String[] args) {
		
		int [] arr= {25,12,42};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					
				}
				
			}
			
			if(count>1) {
				
				
				System.out.println(arr[i]+" occcurs "+ count+ " times");
				
			}
			else
				System.out.println(arr[i]+" occcurs "+ count+ " time");
			
		}

	}

}
