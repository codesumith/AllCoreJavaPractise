package com.sumith.arraylistLabNov13;

import java.util.Arrays;
//import java.util.Collections;

public class Largestnum {
	
	public static void main(String[] args) {
		
//		String [] arr = {"3","30","34","5","9"};
//		
//		Integer [] arr2 = {1,2,3,8,8,6,3,2,1,6789};
//		
		String [] arr5 = {"57","89","24","0","2"};
		
	//Arrays.sort(arr2);
	
	//Arrays.sort(arr2,Collections.reverseOrder());
		
		
		
		//Arrays.sort(arr,Collections.reverseOrder());
		
		Arrays.sort(arr5,(num1,num2)-> (num2+num1).compareTo(num1+num2));
	
	System.out.println(Arrays.toString(arr5));
	}

}
