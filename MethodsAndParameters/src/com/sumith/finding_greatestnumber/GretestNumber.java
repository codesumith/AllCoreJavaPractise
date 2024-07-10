package com.sumith.finding_greatestnumber;

public class GretestNumber {
	
	public static int getGreatest(int val1,int val2,int val3){
		
		if(val1<0||val2<0||val3<0) 
		{
		return -1;	
		}
		else if(val1==0||val2==0||val3==0) 
		{
			return -2;
		}
		else
		{
			if(val1>val2&&val1>val3) return val1;
			else if(val2>val1&&val2>val3) return val2;
			else return val3;
		}
	}

}
