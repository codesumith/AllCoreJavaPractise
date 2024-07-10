package com.sumith.student_aug4;


//DayScholar class
class DayScholar extends Student {
 // Instance Variable
	double transportFee;

 // Parameterized Constructor
 public DayScholar(int studentId, String name, double examFee, double transportFee) {
    //Write Logic Here
	 super(studentId,name,examFee);
	 this.transportFee=transportFee;
 }

 // Method to display details
public String displayDetails() {
	return toString();
}

 @Override
public String toString() {
	return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
			+ examFee + "]";
}

// Method to pay fee
 @Override
 public double payFee(double amount) {
   return  (this.transportFee+super.examFee)-amount;
 }


}
