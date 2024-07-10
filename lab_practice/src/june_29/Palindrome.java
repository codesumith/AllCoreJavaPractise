package june_29;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		int ThreeDigitNumber=34;
		int rev=0;
		int Reminder=0;
		int ThreeDigitNumber1=ThreeDigitNumber;
		 if(ThreeDigitNumber<0)
		{
			System.out.println("The Given Number is -ve Kindly Provide +ve Three digit Number");
		}
		 else if (ThreeDigitNumber>=0&&ThreeDigitNumber<100) 
		{
			System.out.println("-2 ");
			System.out.println("This program can check the operation for the 3 number only.");
			
		}
		 else if(ThreeDigitNumber>=100&&ThreeDigitNumber<=999)
		{
			
		while(ThreeDigitNumber1!=0)
		{
			Reminder=ThreeDigitNumber1%10;
			rev=rev*10+Reminder;
			ThreeDigitNumber1=ThreeDigitNumber1/10;
		}
			System.out.println(rev);
		if (rev==ThreeDigitNumber) 
		{
		
			System.out.println("1");
		}
		
			else if(rev!=ThreeDigitNumber) 
			{
			System.out.println("0");
			}
		
		
		}

		
	}
	}


			
		
		
	

	
