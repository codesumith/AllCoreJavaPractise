package com.sumith.exam_mcqaug26;

class ClassA {
	public int numberOfInstances;

	protected ClassA(int numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}
}

public class Ex9 extends ClassA {
	

	private Ex9(int numberOfInstances) {
		super(numberOfInstances);
	}

	public static void main(String[] args) { 
Ex9 ext = new Ex9(420); 
 System.out.print(ext.numberOfInstances); 
 }
}