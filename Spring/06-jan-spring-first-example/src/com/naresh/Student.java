package com.naresh;

public class Student {
	
	int id ;
	String name;
	
	public Student()
	{
		System.out.println("Student object created");
	}
	
	public void printStudentInformation()
	{
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
	}

}
