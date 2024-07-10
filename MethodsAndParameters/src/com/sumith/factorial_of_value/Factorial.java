package com.sumith.factorial_of_value;

public class Factorial {
	
	public int getFactorial(int num) {
		int fact=1;
		if(num<0) return -1;
		else if(num==0) return -2;
		else {
			for(int i=1;i<=num;i++) {
				
				fact=fact*i;
				
				
				
			}
			
			
		}
		return fact;
		
		
		
		
	}
	

}
