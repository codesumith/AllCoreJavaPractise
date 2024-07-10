package com.sumith.finding_differenceoftwidigit;

public class TwoDigitDifference {

	public static int getDiffOfDigits(int number) {
		int quotient=number/10;
		int reminder=number%10;
		
		return quotient-reminder;
		
	}

}
