package com.sumith.july13;

public class StepIncrement {

	
   String x="";
	
		 
		public  String getNumbersInRange(int num1, int num2, int step) {
			
			if(num1<0||num2<0||step<0) {
				return "-1";
			}
			else if(num1==num2) {
				return "-2";
			}
			else if(num1>num2) {
				return "-3";
			}
			
			else if(num1<=num2) { // 1   20    2
				
					
					x=x+ ++num1+" ";
					num1=--num1+step;  //1+2=3
					getNumbersInRange(num1,num2,step);
				
					
				}
			return x;
			}
			
		
			

		
		
		
		
		
		
		

		public static void main(String[] args) {
			
			StepIncrement s= new StepIncrement();
			String r=s.getNumbersInRange(1,50,5);
             System.out.println(r);
		}

	}

	
	
	
	
	
	
	
