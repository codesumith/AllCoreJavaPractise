package june_23;

public class ComputeTheSumOfTwoDigits {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int firstdigit =a/10;
		int seconddigit =a%10;
		int sum = firstdigit+seconddigit;
		System.out.println("sum="+sum);

	}

}
