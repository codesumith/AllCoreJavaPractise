package com.sumith.Iq;

public class Array_appears_15_at_first_and_last {

	public static void main(String[] args) {
		 int []x= {10,20,30,40,50,15};
		 
		 boolean b=firstLast(x);
		 
		 System.out.println("15 is available : "+b);
	}
	
	public static boolean firstLast(int[] nums) {
		
		if(nums[0]==15 || nums[nums.length-1]==15) {
			return true;
		}
		else {
			return false;
		}
	}

}
