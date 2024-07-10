package Addition;
//blc
public class Add {
	public static int  addition(int number) {
		
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
		else
		{
			int reminder=number%10;
					int quotient=number/10;
					int result=reminder+quotient;
					System.out.println(result);
		}
		return number;
		
	}

}
