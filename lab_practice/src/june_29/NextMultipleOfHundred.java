package june_29;

public class NextMultipleOfHundred {

	public static void main(String[] args) {
		int Number=123;
		int nextmultiple;
		if(Number<=0)
		{
			System.out.println("Next Multiple:-1");
		}
		else 
		{
			int Reminder=Number%100;
		   if(Reminder==0)
			{
		nextmultiple=Number;
		
				System.out.println("Next Multiple:"+nextmultiple);
			}
				else 
				{
					nextmultiple=Number+100-Reminder;
					System.out.println("Next Multiple:"+nextmultiple);
			}
		}
			

	}

}
