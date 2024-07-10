package com.sumith.aug29;

public class Finding_Missing_Element_logicalclass {
	
	public static void main(String[] args) {
		
		
		int sum=0;
		int [] arr= {1,2,3,4,5,6,8};
		int actualSize=arr.length+1;//8
		int totalCount=actualSize*(actualSize+1)/2;
		    //          8*9/2
		//              72/2
		//              36
		
		for(int num:arr) {
			sum+=num;
		}
		
		int missingEle=totalCount-sum;
		                //36-29
		
		System.out.println("Missing Elemnt is : "+missingEle);//7
	}

}
