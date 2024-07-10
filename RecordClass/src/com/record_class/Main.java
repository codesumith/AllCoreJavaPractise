package com.record_class;

public class Main {
	
	public static void main(String[] args) {
		CustomerClass cls1 =new CustomerClass(1, "A", 23);
		CustomerClass cls2 =new CustomerClass(2, "A", 23);
		cls1.setCustomerName("AA");
		System.out.println(cls1.equals(cls2));
		System.out.println(cls1);
		System.out.println(cls1.getCustomerName());
		
		
		System.out.println("...........................");
		
		
		CustomerRecord r1  = new CustomerRecord(-9,"A" ,23);
		CustomerRecord r2  = new CustomerRecord(1,"A" ,23);
		System.out.println(r1.equals(r2));
		System.out.println(r1);
		System.out.println(r1.customerName());
		
	}

}
