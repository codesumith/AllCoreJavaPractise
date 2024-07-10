package com.sumith.labwork_sep19;

import java.util.Scanner;

@SuppressWarnings("serial")
class WrongPasswordException extends Exception {

	public WrongPasswordException(String message) 
	{
		super(message);
		//System.out.println("The password you have entered is invalid");

	}

}

class Validator {

	boolean validate = false;

	public boolean validatePassword(String pass) throws WrongPasswordException {
		int capital = 0;
		int small = 0;
		int symbol = 0;
		int number = 0;
		int spaces = 0;

		for (int i = 0; i < pass.length(); i++) {

			if (pass.charAt(i) == 32) {
				spaces++;
			}

			else if (Character.isUpperCase(pass.charAt(i))) {
				capital++;

			}

			else if (Character.isLowerCase(pass.charAt(i))) {

				small++;
			}

			else if (Character.isDigit(pass.charAt(i))) {
				number++;
			}
			else {
				symbol++;
			}

		}

		int size = capital + small + symbol + number + spaces;

		if (spaces == 0 && size >= 8 && capital >= 1 && small >= 2 && symbol >= 1 && number >= 1&&small>capital) {
			
			this.validate = true;
		} 
		
		else {
			throw new WrongPasswordException("The password you have entered is invalid");
		}

		return validate;

	}

}

public class PasswordValidation {

	public static void main(String[] args) throws WrongPasswordException {

		Scanner sc=new Scanner(System.in);
		
		Validator v = new Validator();
		System.out.println("Enter the password : ");
		try {
		if(v.validatePassword(sc.next()))
		{
			System.out.println("Welcome to SBI");
		}
		}
		catch(WrongPasswordException e)
		{
			System.out.println(e.getMessage());
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			e.printStackTrace();
		}
		
		sc.close();

	}

}
