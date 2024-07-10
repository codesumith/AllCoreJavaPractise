package june8thtestPaper;

import java.util.Scanner;

public class BasicCalculatorOperations {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.print("Enter value 1:");
		int num1=sc.nextInt();
		System.out.print("Enter value 2:");
		int num2=sc.nextInt();
		System.out.print("Enter choice of operator:");
		char op =sc.next().charAt(0);
		if(op=='+')
		{
		int add=num1+num2;
		System.out.println("result:"+add);	
		}
		if(op=='-')
		{
		int sub=num1-num2;
		System.out.println("result:"+sub);	
		}
		if(op=='*')
		{
		int mul=num1*num2;
		System.out.println("result:"+mul);	
		}
		if(op=='/')
		{
		int div=num1/num2;
		System.out.println("result:"+div);	
		}
sc.close();
	}

}
