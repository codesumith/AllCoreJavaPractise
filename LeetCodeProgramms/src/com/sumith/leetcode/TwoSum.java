package com.sumith.leetcode;

import java.util.Arrays;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        int sum=0;
        
        int [] index=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
           
            for(int j=1;j<nums.length;j++)
        {
            	 sum=nums[i];
                 sum+=nums[j];
                 
            if(sum==target)
            {
            	
             index[0]=i;
             index[1]=j;
             break;
              
            }
           
        }
            if(sum==target) break;
        
    }
        return index;
	}

	public static void main(String[] args) {
		//int []nums = {2,7,11,15};
		int []nums1 = {3,3};
		System.out.println(Arrays.toString(twoSum(nums1, 6)));
	}

}
