package com.sumith.leetcode;

import java.util.Arrays;


public class Median_of_Two_Sorted_Arrays {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int [] merge= new int[nums1.length+nums2.length];
		int index=0;
		double sum=0;
		double div = 0;
		
		
		for(int i=0;i<nums1.length;i++)
		{
		merge[index]=nums1[i];
		index++;

		}

		for(int i=0;i<nums2.length;i++)
		{
		merge[index]=nums2[i];
		index++;
		}

		Arrays.sort(merge);
		
		int median =nums1.length+nums2.length;
		
		
		if(median%2==0)
		{
			sum+=merge[median/2];
			sum+=merge[(median/2)-1];
			 div=sum/2;
		}
		else
		{
			
			sum+=merge[median/2];
			div=sum;
		}
		return div;
		    }
		
	public static void main(String[] args) {
		int[] num1= {1,3};
		int []num2= {2,4};
		System.out.println(Median_of_Two_Sorted_Arrays.findMedianSortedArrays(num1, num2));
		
	}

}
