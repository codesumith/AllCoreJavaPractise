package june_29;

public class SumOfTwoDigitNumber {

	public static void main(String[] args) {
		int digit,sum;
		int Number=35;
		if(Number>=10&&Number<=99)
		{
			digit=(Number/10);//+(Number%10);
			Number=Number%10;
			sum=Number+digit;
			System.out.println("Sum Of Digit:"+sum);
		}
		else if(Number<0)
		{
			System.out.println("-3");
		}
		else if(Number>99)
		{
			
			System.out.println("-2");
		}
		else if(Number>=0&&Number<=9)
		{
			System.out.println("-1");
		}
	}
	

}
