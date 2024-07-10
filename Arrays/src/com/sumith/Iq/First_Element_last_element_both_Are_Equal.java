package com.sumith.Iq;

import java.util.Arrays;

public class First_Element_last_element_both_Are_Equal {

	public static void main(String[] args) {
		 int [] ar= {10,20,30,10};
		 
		 boolean b= firstLast(ar);
		  System.out.println("First last are equal : "+b);
		  System.out.println(Arrays.toString(ar));
		  
	}
	
	public static boolean firstLast(int [] nums) {
		
		if(nums[0]==nums[nums.length-1]) {
		
			return true;
			
		}
		else {
			
			return false;
		}
		
		
		
		 

	}

}
