package com.sumith.spy_number;

public class Calculate {
	//public static void main(String[]args) {
	public void checkSpyNum(int number) {
		int sum=0;
		int mul=1;
		while(number!=0) {
		  int ld=number%10;
		  sum=sum+ld;
		  mul=mul*ld;
		  number =number/10;
		 
			
			}
		if(sum==mul)
		{
			System.out.println("it is spy");
		}
		else
		{
			System.out.println("it is not spy");
		}			
	}
}
