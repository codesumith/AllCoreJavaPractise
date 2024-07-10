package com.sumith.payraoll_aug7th;

public class Trainer extends Employee {
	
	
	int batchCount;
	double perkPerBatch;
	
	public Trainer() {
		
	}

	public Trainer(int id, String name, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super(id, name, basicSalary, hRAPer, dAPer);
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}



	public double calculateGrossSalary() {
		double grossSalary=basicSalary+HRAPer+DAPer+(batchCount *perkPerBatch);
		
		return grossSalary;
	}

	@Override
	public String toString() {
		return "Trainer [ id=" + id + ", name=" + name
				+ ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", batchCount=" + batchCount + ", perkPerBatch=" + perkPerBatch + 
				", GrossSalary=" + calculateGrossSalary() + "]";
	}







	
	
}
