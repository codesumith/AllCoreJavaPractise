package com.sumith.factors;

public class All_Factors_Of_Number {
	//String fact="";
    public String getFactors(int num) {
    	String fact="";
		if(num<0) return "-1";
		else if(num==0) return "-2";
		else {
			for(int i=1;i<=num;i++) {
				
				if(num%i==0) {
					fact=fact+i+" ";
					}
				
				
			}
			
			
			
			
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		return fact;	
    }
	
   
	
	

}
