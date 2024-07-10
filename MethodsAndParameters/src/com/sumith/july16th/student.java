package com.sumith.july16th;
//BLC
public class student {
	 private int studentId;
	 private String studentName;
	 private int marks;
	 private char grade;
	 
	 public void calculateGrade() {
		
		 if(marks>90) grade='A';
		 else if(marks<=90&&marks>=81) grade='B';
		 else if(marks<=80&&marks>=71) grade='C';
		 else if(marks<=70&&marks>=61) grade='D';
		 else {
			 grade='E';
		 }
		 
	 }
	public void setStudentData(int studentId,String studentName,int marks) {
		
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
	}
	
	String displayDetails() {
		
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";	
		
	}
	
	

}
