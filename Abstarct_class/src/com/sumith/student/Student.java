package com.sumith.student;

public abstract class Student {
	
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents=0;

	public abstract int getPercentage() ;
		
	public static int getTotalNoStudents() {
		return totalNoOfStudents;
		
	}
	
	public Student() {
		totalNoOfStudents++;	
	}

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	
	
	
}
