package com.sumithPasswordValidationTest_sep23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try (sc) {
			System.out.println("Enter value of a : ");
			//int a = sc.nextInt();

			System.out.println("Enter value of b : ");
			//int b = sc.nextInt();
		} catch (InputMismatchException e) {
			e.getMessage();
			e.printStackTrace();
			e.toString();
			System.out.println("Please enter digit only.");
		}

	}

}
