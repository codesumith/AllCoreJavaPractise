package com.sumith.arraysPractise;

public class Finding_duplicate_numbers_in_unsorted_Array {

	public static void main(String[] args) {
		
    int [] arr= {10,20,30,50,30,20,10,10};
    int count=0;
    for(int i=0;i<arr.length;i++) {
    	
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[i]==arr[j]) {
    			arr[j]='*';
    			count++;
    			
    			
    		}
    		
    		}
    	if(count>0&&arr[i]!='*') {
    		System.out.println("Dupliacte element is : "+arr[i]);
    		count=0;
    	}
    }
	}

}
