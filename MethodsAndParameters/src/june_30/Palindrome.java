package june_30;

public class Palindrome {

	public static boolean isPalindrome(int number){
	
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
				
				System.out.println("palindrome");
				return true;
		}
			
				else if(rev!=number)
				{
					
					System.out.println("Not a palindrome");
				
					
				}
		}
		return false;
		
		
	}

}
