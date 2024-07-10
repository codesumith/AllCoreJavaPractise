package com.sumith.july12;

import java.util.Scanner;

public class Natural_numbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter natural number from:");
		int start=sc.nextInt();
		System.out.print("enter natural numbers upto:");
		int naturalNumber=sc.nextInt();
		int sum=0;
		
		for(int i=start;i<=naturalNumber;i++) {
			
			sum+=i;
		}
		
System.out.println(sum);
sc.close();
	}

}
