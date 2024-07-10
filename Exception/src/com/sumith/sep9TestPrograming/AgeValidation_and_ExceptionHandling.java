package com.sumith.sep9TestPrograming;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message);
	}

}

class CustomExceptionHandling {
	public void validateAge(int age) throws Exception {

		if (age < 0) {

			throw new Exception("Age must be at least 18 years old.");

		} 
		else if (age < 18) 
		{
			throw new InvalidAgeException("Age must be at least 18 years old. ");
		}

		else {
			System.out.println("Age is valid. You can proceed.");
		}
	}
}

public class AgeValidation_and_ExceptionHandling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try (sc) {

			System.out.print("Enter the age : ");
			int age = sc.nextInt();

			CustomExceptionHandling c = new CustomExceptionHandling();
			c.validateAge(age);
		} catch (InvalidAgeException e) {
			System.err.println("InvalidAgeException : " + e.getMessage());
		} catch (Exception e) {
			System.err.println("An Unexpected error accoured  : " + e.getMessage());
		}

	}

}
