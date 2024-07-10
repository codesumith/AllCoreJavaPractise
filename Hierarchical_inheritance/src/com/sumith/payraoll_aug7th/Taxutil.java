package com.sumith.payraoll_aug7th;

public class Taxutil extends Employee{
	
	double tax;
	public double calculateTax(Employee e) {
		
		
		if(e.calculateGrossSalary()>30000) {
			 
			 tax=(e.calculateGrossSalary()*20)/100;
			return tax;
		}
		else {
			
			tax=(e.calculateGrossSalary()*5)/100;
			return tax;
		}
		
	}
	
public double calculateTax(Manager m) {
		
		
	if(m.calculateGrossSalary()>30000) {
		 
		 tax=(m.calculateGrossSalary()*20)/100;
		return tax;
	}
	else {
		
		tax=(m.calculateGrossSalary()*5)/100;
		return tax;
	}
	}
	
public double calculateTax(Trainer t) {
	
	if(t.calculateGrossSalary()>30000) {
		 
		 tax=(t.calculateGrossSalary()*20)/100;
		return tax;
	}
	else {
		
		tax=(t.calculateGrossSalary()*5)/100;
		return tax;
	}
	
}

public double calculateTax(Sourcing s) {
	
	
	if(s.calculateGrossSalary()>30000) {
		 
		 tax=(s.calculateGrossSalary()*20)/100;
		return tax;
	}
	else {
		
		tax=(s.calculateGrossSalary()*5)/100;
		return tax;
	}
}
}
