package com.sumith.finding_greatestnumber;

public class FindingGreatestValue {

	public static void main(String[] args) {
		int greatest = GretestNumber.getGreatest(10,20,300);
		
		if(greatest>0) {
			System.out.println("Greatest Value:"+greatest);
		}
		else {
			System.out.println(greatest);
		}

	}

}
