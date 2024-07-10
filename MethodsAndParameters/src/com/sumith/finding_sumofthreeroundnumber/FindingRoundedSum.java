package com.sumith.finding_sumofthreeroundnumber;

public class FindingRoundedSum {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		int getroundOfNumbers = RoundedSum.getroundOfNumbers(a,b,c);
		System.out.println("sum Of Three round Of Numbers:"+getroundOfNumbers);

	}

}
