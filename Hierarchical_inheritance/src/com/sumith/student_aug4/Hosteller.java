package com.sumith.student_aug4;


//Hosteller class
class Hosteller extends Student {
 // Instance Variable
double hostelFee;

 // Parameterized Constructor
 public Hosteller(int studentId, String name, double examFee, double hostelFee) {
 
     //Write Logic Here
	 super(studentId,name,examFee);
	 this.hostelFee=hostelFee;
     
 }

 // Method to display details
 public String displayDetails() {
		return toString();
	}
 // Method to pay fee
 @Override
 public double payFee(double amount) {
    
    //Write Logic Here
	 return (hostelFee+super.examFee)-amount;
    
 }

@Override
public String toString() {
	return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee=" + examFee
			+ "]";
}


}