package june_30;

public class SumofTwoDigits {

	public static int sumOfTwoDigits(int number)
	{
	int sum=0;
	 if(number<0)
	{
		return -3;
	}
	else if(number>99)
	{
		return -2;
	}
	else if(number>=0&&number<=9)
	{
		return -1;
	}
	
	else if( number>=10&&number<=99)
		{
			int reminder=number%10;
			int quotient=number/10;
			sum=reminder+quotient;
		}
			
		return sum;
	
		
  		
	}

}


