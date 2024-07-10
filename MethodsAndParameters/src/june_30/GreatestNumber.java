package june_30;

public class GreatestNumber {

	public static  int greatest(int number1,int number2,int number3) {
		if(number1<0||number2<0||number3<0)
		{
		 return -1;
		}
		else if(number1==0||number2==0||number3==0)
		{
			return -2;
		}
		else if(number1>number2  &&  number1>number3)return number1; 
		else if(number2>number1  &&  number2>number3)return number2;
		else if(number3>number1  &&  number3>number2)return number3;
		return number3;
		 
	}

}
