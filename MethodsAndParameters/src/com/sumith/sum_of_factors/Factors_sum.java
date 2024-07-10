package com.sumith.sum_of_factors;

public class Factors_sum {
	
	public int getSumOfFactors(int num) {
		int fact=0;
		
		if(num<0) return -1;
		else if(num==0) return -2;
		else {
			for(int i=1;i<=num;i++) {
				 if(num%i==0) {
					 
					 fact=fact+i;
					 
				 }
				
				
				
			}
			
			
		}
		return fact;
		
	}
	
	
	

}
