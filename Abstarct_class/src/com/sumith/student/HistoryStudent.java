package com.sumith.student;

public class HistoryStudent extends Student {

	private int historyMarks;
	private int civicsMarks;
	
	public HistoryStudent(String string, String string2, int i, int j) {
		studentName=string;
		studentClass=string2;
		historyMarks=i;
		civicsMarks=j;
	}

	@Override
	public int getPercentage() {
		int totalmarks=historyMarks+civicsMarks;
		int perc=(totalmarks*100)/200;
		return perc;
	}

	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", studentName="
				+ studentName + ", studentClass=" + studentClass + ", Percentage =" + getPercentage() + ", TotalNumberOfStudents = "+super.getTotalNoStudents()+"]";
	}

	

}
