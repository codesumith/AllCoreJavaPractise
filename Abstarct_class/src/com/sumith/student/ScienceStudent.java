package com.sumith.student;

public class ScienceStudent extends Student{

	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent(String string, String string2, int i, int j, int k) {
		studentName=string;
		studentClass=string2;
	    physicsMarks=i;
		chemistryMarks=j;
		mathsMarks=k;
	}

	
	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", studentName=" + studentName + ", studentClass=" + studentClass + ", Percentage ="
				+ getPercentage() + ", TotalNumberOfStudents = "+super.getTotalNoStudents()+"]";
	}


	@Override
	public int getPercentage() {
		int totalMarks=physicsMarks+chemistryMarks+mathsMarks;
		int percentage=(totalMarks*100)/300;
		return percentage;
	}

	
}
