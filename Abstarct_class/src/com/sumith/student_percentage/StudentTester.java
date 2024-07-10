package com.sumith.student_percentage;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Student s=new ScienceStudent("Anil", "Science", 90, 90, 90);
	System.out.println(s);
	System.out.println("percentage= "+s.getPercentage());
	System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	
	
	HistoryStudent h=new HistoryStudent("jhon", "History", 80, 75);
	System.out.println(h);
	System.out.println("percentage= "+h.getPercentage());
	System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

	}

	
}
