package com.sumith.student_percentage;

public class ScienceStudent extends Student {
	
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	

	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}



	


	@Override
	public String toString() {
		return "ScienceStudent [ studentName= " + studentName + ", studentClass= " + studentClass + ",physicsMarks= " + physicsMarks + ", chemistryMarks= " + chemistryMarks + ", mathsMarks= "
				+ mathsMarks + ", TotalNumberOfStudents= "+getTotalNoStudents()+"]";
	}






	@Override
	public int getPercentage() {
		
	int percentage=((physicsMarks+chemistryMarks+mathsMarks)*100)/300;
	
		return percentage;
	}

}
