package com.sumith.user_define_exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	public InvalidAgeException()
	{
		
	}
	
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class UserDefineCheckedException {

	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);

try(sc){
	System.out.print("Enter your age : ");
	int age =sc.nextInt();
	
	if(age<18)
	{
		throw new InvalidAgeException("You are minor try after some year");
	}
	else
	{
		System.out.println("Go for movie");
	}
}
catch(InvalidAgeException  e)
{
	System.err.println(e.getMessage());
	e.printStackTrace();
}

	}

}
