package com.sumithPasswordValidationTest_sep23;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (sc) 
		{
			System.out.print("Enter your Password : ");
			if (PasswordValidator.validatePassword(sc.nextLine()))
			{
				System.out.println("Password Succefully validate.");
			}
		} 
		catch (InvalidPasswordException e) 
		{
			System.out.println(e.getMessage());
		}

	}

}
