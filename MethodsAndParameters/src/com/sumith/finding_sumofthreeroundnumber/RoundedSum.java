package com.sumith.finding_sumofthreeroundnumber;

public class RoundedSum {
	
	public static int getroundOfNumbers(int number1,int number2,int number3)
	{
		
		int quotient1=(number1/10);
				int num1=(quotient1+1)*10;
				int quotient2=(number2/10);
				int num2=(quotient2+1)*10;
				int quotient3=(number3/10);
				int num3=(quotient3+1)*10;
				return num1+num2+num3;
		
				
	}

}
