package cpm.sumith.factorial_of_a_value;

public class Fact_value {
	
	
	
	public String factorial(int num) {
		
		int temp=1;
		for(int i=1;i<=num;i++) {
			
			 temp=temp*i;
		}
		
		
		
		
		return "Factorial is:"+temp;
		
		
	}

}
