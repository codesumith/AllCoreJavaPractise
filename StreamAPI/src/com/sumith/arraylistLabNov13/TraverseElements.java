package com.sumith.arraylistLabNov13;

import java.util.Arrays;

public class TraverseElements {

	
	public String largestNumber(String qrr[]) {
		
		
			Arrays.sort(qrr,(num1,num2) -> (num2+num1).compareTo(num1+num2));
			String s ="";
			for(String str :qrr) {
				s=s.concat(str);
			}
		return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,8,8,6,3,2,1};
		
		String []arr1= {"3","30","34","5","9"};
		System.out.println(new TraverseElements().largestNumber(arr1));
		
		for(int i=0;i<arr.length;i++)
		{
			int duplicate=1;
			for(int j =i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					duplicate++;
					if(duplicate==2) 
					{
						arr[j]='*';
						break;
					}
				}
				
				
			}
			
			if(duplicate ==1&&arr[i]!='*') System.out.println("Unique value is:"+arr[i]); 
		}
		
		
		
	}

	}
