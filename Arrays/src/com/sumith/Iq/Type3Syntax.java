package com.sumith.Iq;

import java.util.Arrays;

public class Type3Syntax {
	
	public static void main(String[] args) {
		
		int [] arr=new int[] {10,20,30,40};
		System.out.println(Arrays.toString(arr));
		
		int i1=1,i2=2;
		int[ ] arr1 =new int[] {i1,i2};
		System.out.println(Arrays.toString(arr1));
		
		Object [] ob= {"sumith",true,2.1,2000L};
		System.out.println(Arrays.toString(ob));
	}

}
