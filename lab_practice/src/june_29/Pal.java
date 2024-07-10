package june_29;

public class Pal {

	public static void main(String[] args) {
		int number=34;
		int rev=0;
		int number1=number;
		
		if(number>=100&&number<=999)
		{
			while(number1!=0)
			{
				int reminder=number1%10;
				rev=rev*10+reminder;
				number1=number1/10;
				
				
			}
			System.out.println("reverse"+rev);
		if (rev==number)
				
			{
				System.out.println("1");
				System.out.println("palindrome");
			}
				else if(rev!=number)
				{
					System.out.println("0");
					System.out.println("Not a palindrome");
					
				}
		}
				else if(number<=0)
				{
					System.out.println("-1");
					System.out.println("The Given Number is -ve Kindly Provide +ve Three digit Number");
				}
				else if(number>0&&number<100)
				{
					System.out.println("-2");
					System.out.println("This program can check the operation for the 3 number only.");
				}
			}
		
}
	




