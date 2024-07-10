package com.sumith.student_aug4;

public class Student {  //super class
	// Student class
	
	    // Instance Variables
	    int studentId;
	    String name;
	    double  examFee;

	    // Parameterized Constructor
	    public Student(int studentId, String name, double examFee) {
	      //Write Logic Here
	    	this.studentId=studentId;
	    	this.name=name;
	    	this.examFee=examFee;
	    }

	    // toString method
	    @Override
		public String toString() {
			return "Student [studentId=" + studentId + ", name=" + name + ", ExamFee= " + examFee+ "]";
		}


	    // Method to display details
	    public String displayDetails() {
	        return toString();
	    }

	    // Method to pay fee
	   
		public double payFee(double amount) {
	        return examFee-amount;
			
	    }
	}


