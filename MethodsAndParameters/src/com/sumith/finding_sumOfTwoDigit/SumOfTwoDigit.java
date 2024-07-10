package com.sumith.finding_sumOfTwoDigit;

public class SumOfTwoDigit {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int reminder=number%10;
		int quotient=number/10;
		int result=reminder+quotient;
		System.out.println("Sum Of Digits:"+result);

	}

}
