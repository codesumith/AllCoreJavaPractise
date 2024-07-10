package com.sumith.try_catch_blocks;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Please enter the value of x : ");
			int x = sc.nextInt();

			System.out.print("Please enter the value od y : ");
			int y = sc.nextInt();

			int z = x / y;
			System.out.println("z value is :" + z);
		} catch (Exception e) {

			System.err.println("Please dont put zero");
		}
		System.out.println("Thank you for visiting..!!");
		sc.close();
	}

}
