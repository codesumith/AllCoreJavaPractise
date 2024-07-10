package com.sumith.string_and_its_method_related_pg;

public class EqualsMethod2 {

	public static void main(String[] args) {
		
		String userName =args[0]; //command line argument
		
		if(userName.equals("sumith"))
			{
			System.out.println("Welcome sumith"); 
			}
		else
			System.out.println("Sorry ! wrong user name / password");
			

	}

}
