package june_24;

public class ReverseAThreeDigitNumber {

	public static void main(String[] args) {
		int Number=Integer.parseInt(args[0]);
		int rev   =0;
		while(Number!=0) 
		{
			 rev   =rev*10+Number%10;
			 Number=Number/10;
			//System.out.println("ReverseNumber:"+Num);
		}
        System.out.println("ReverseNumber:"+rev);
	}

}
