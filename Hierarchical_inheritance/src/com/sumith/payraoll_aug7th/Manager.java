package com.sumith.payraoll_aug7th;

public class Manager extends Employee{
	
	double projectAllowance;
	
	public Manager() {
		
	}
	
public Manager(int id, String name, double basicSalary, double hRAPer, double dAPer, double projectAllowance) {
		super(id,name,basicSalary,hRAPer,dAPer);
		
		this.projectAllowance = projectAllowance;
	}


public double calculateGrossSalary() {
	double grossSalary=basicSalary+HRAPer+DAPer+projectAllowance;
		
		return grossSalary;
	}

@Override
public String toString() {
	return "Manager [ id=" + id + ", name=" + name + ", basicSalary="
			+ basicSalary + ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", projectAllowance=" + projectAllowance + ", GrossSalary="
			+ calculateGrossSalary() + "]";
}


}
