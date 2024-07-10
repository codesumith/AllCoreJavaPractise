package com.sumith.functionalinterface;


import java.util.UUID;
import java.util.function.Supplier;

@SuppressWarnings("rawtypes")
public class StudentIdDistributer implements Supplier {

	public static void main(String[] args) {
		
		StudentIdDistributer s=new StudentIdDistributer();
		
		Student s1 = new Student("Arjun",s.get(),'A');
		System.out.println(s1);

	}

	@Override
	public  String get() {
		String studnetid = UUID.randomUUID().toString().substring(1, 8);
		
		return studnetid;
	}

}
