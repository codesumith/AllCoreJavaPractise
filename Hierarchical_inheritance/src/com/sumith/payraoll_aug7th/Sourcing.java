package com.sumith.payraoll_aug7th;

public class Sourcing extends Employee{
	
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;

	
	
	public Sourcing() {
		
	}



	public Sourcing(int id, String name, double basicSalary, double hRAPer, double dAPer, int enrollmentTarget,
			int enrollmentReached, double perkPerEnrollment) {
		super(id, name, basicSalary, hRAPer, dAPer);
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double calculateGrossSalary() {
		double grossSalary=basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
		
		return grossSalary;
	}



	@Override
	public String toString() {
		return "Sourcing [ id=" + id + ", name=" + name + ", basicSalary="
				+ basicSalary + ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", enrollmentTarget=" + enrollmentTarget + ", enrollmentReached=" + enrollmentReached+ ", perkPerEnrollment=" + perkPerEnrollment + ",  GrossSalary="
				+ calculateGrossSalary() + "]";
	}
	
	
}
