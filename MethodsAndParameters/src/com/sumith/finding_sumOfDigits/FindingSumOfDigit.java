package com.sumith.finding_sumOfDigits;

public class FindingSumOfDigit {

	public static void main(String[] args) {
		int sumOFDigits = GetSumOfDigits.getSumOFDigits(-3);
if(sumOFDigits>0)
{
	System.out.println("Sum Of Two Digits:"+sumOFDigits);
}
else if(sumOFDigits==-3)
{
	System.out.println("The give number is negetive kindly provide positive two digit number");
}
else if(sumOFDigits==-2)
{
	System.out.println("The give number is 3 digit kindly provide  two digit number");
}
else
{
	System.out.println("The give number is single digit kindly provide positive two digit number");
	
}

	}

}

