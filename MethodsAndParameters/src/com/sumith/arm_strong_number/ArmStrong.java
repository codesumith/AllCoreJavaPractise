package com.sumith.arm_strong_number;

public class ArmStrong {

	public static String checkArmStrong(int num) {
		
				int temp=num;
				int rem,sum=0;
	if(num<0) return"-1";
	else if(num<1000||num>9999) return "-2";
	else {
		while(num!=0) {
		rem=num%10;
		sum=sum+(rem*rem*rem*rem);
		num=num/10;
		}
		if(temp==sum) return "ArmStrong Number";
		else return "Not ArmStrong Number";
	}
	
	
	
	
	
	
	
	
	
	
	
	
			
		
	}
	
	
	
}
