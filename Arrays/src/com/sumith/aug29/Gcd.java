package com.sumith.aug29;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number :");int one=sc.nextInt();
		
		System.out.println("Enter the Second number :");int Second=sc.nextInt();
		
		int gcd=(one>Second) ? one:Second;
		
		while(true) {
			
			if(one%gcd==0&&Second%gcd==0) {
				break;
			}
			else {
				--gcd;
			}
		}
		
		System.out.println(" GCD is : "+gcd);
		
		sc.close();

	}

}
