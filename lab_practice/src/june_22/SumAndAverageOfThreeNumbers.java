package june_22;

public class SumAndAverageOfThreeNumbers {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int sum = a+b+c;
		int avg = sum/3;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);

	}

}
