package com.sumith.student_percentage;

public class HistoryStudent extends Student{
	
	private int historyMarks;
	private int civicsMarks;
	
	

	



	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}







	@Override
	public String toString() {
		return "HistoryStudent [studentName= "+ studentName + ", studentClass= " + studentClass +",historyMarks= " + historyMarks + ", civicsMarks= " + civicsMarks + ", TotalNumberOfStudents= "+getTotalNoStudents()+"]";
	}







	@Override
	public int getPercentage() {
		int percentage=((historyMarks+civicsMarks)*100)/200;
		return percentage;
	}







	
	
}
