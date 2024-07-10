package com.sumith.july16th;

public class Get_student_details {
//ELC
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s= new student();
		s.setStudentData(123,"Srinivasan",78);
		s.calculateGrade();
		System.out.println(s.displayDetails());

	}

}
