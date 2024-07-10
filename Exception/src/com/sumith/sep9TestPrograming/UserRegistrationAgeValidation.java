package com.sumith.sep9TestPrograming;

@SuppressWarnings("serial")
class AgeLimitException extends Exception{
	
	
	public AgeLimitException()
	{
		
	}
	
	public AgeLimitException(String msg)
	{
		super(msg);
	}
}

class User{
	private String name;
	private int age;
	
	public User(String name, int age) throws AgeLimitException {
		super();
		if(age<18) {
			throw new AgeLimitException("User age must be 18 or older");
		}
		
		else {
		this.name = name;
		this.age = age;
		}
		
		
		
	}

	
	public String displayDetails() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class UserRegistrationAgeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			User u=new User("Bob",25);
			System.out.println(u.displayDetails());
		}
		catch(AgeLimitException e){
			System.out.println(e.getMessage());
		}
		try {
		User u=new User("Alice",16);
		System.out.println(u.displayDetails());
		}
		catch(AgeLimitException e){
			System.out.println(e.getMessage());
		}
		
		

	}

}
