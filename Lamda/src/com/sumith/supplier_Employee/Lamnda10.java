package com.sumith.supplier_Employee;

import java.util.Date;
import java.util.function.Supplier;

public class Lamnda10 {

	public static void main(String[] args) {
		
		Supplier<Employee> empSup= () ->{
			
			Employee e1 =new Employee(11, "Anil", new Date());
			
			return e1;
		};

		System.out.println(empSup.get());
	}

}
