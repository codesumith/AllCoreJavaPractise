package com.sumith.supplier_interface;

import java.util.function.Supplier;

public class Lambda10 {

	public static void main(String[] args) {
		
		Supplier<Student> stdSupplier= () -> new Student(1,"Sumith","male",25);
		
		Student std=stdSupplier.get();
		System.out.println(std);
		
		System.out.println(stdSupplier.get());

	}

}
