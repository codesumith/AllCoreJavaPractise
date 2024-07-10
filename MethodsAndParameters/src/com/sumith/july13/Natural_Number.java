package com.sumith.july13;



public class Natural_Number {
	//String x="";
	public  String getNaturalNumbers(int num1,int num2) {
		String x="";
		if(num1<0||num2<0) {
			return "-1";
		}
		else if(num1==0||num2==0) {
			return "-2";
		}
		
		else if(num1<=num2) {
			
			x=x+num1+" ";
			System.out.print(x);
			num1++;
			getNaturalNumbers(num1,num2);
			
		}
		
		return x;
	}
	public static void main(String[] args) {
		
		Natural_Number s1=new Natural_Number();
		s1.getNaturalNumbers(1, 100);
		
	}
}
