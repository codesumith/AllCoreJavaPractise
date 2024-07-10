package june_22;

public class InterChangeTheValueOfTwoNumbers {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("before interchange"+a+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after interchange"+a+b);

	}

}
