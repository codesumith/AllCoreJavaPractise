package com.sumith.student_percentage;

abstract class Student {

	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents = 0;

	public abstract int getPercentage();

	public static int getTotalNoStudents() {

		return totalNoOfStudents;
	}

	public Student() {
		
	}

	public Student(String studentName, String studentClass) {
		super();
		totalNoOfStudents++;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	

	
}
