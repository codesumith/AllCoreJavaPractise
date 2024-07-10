package com.spring1;

public class Student {
	
	int id ;
	String name;
	
	public Student()
	{
		System.out.println("Studnet is created");
	}
	
	public void printStudentDetails()
	{
		System.out.println("Student Id : "+id);
		System.out.println("Studnet name : "+name);
	}
}
