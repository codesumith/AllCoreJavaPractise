package com.sumith.july13;

public class pattern {
	

	
	public String NumberPattern4(int rows) {
	
		String x="";
		if(rows<0) return "-1";
		else if(rows==0) return "-2";
		else {
			for(int i=1;i<=rows;i++) {
				
				for(int c=1;c<=i;c++) {
					   
					x=x+(i*c)+" ";
					
					
				}
				x=x+("\n");
				
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
	pattern p=new pattern();
	System.out.println(p.NumberPattern4(5));
		
		
		
		
		

	}

}
