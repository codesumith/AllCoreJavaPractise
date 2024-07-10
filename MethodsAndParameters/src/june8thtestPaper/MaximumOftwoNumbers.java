package june8thtestPaper;

import java.util.Scanner;

public class MaximumOftwoNumbers {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.print("enter number1:");
		int num1=sk.nextInt();
		System.out.print("enter number2:");
		int num2=sk.nextInt();
		int max=(num1>num2)? num1:num2;
		System.out.println("Maximum Value:"+max);
		sk.close();

	}

}
