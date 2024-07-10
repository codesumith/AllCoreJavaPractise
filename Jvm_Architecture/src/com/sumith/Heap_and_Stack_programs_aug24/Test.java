package com.sumith.Heap_and_Stack_programs_aug24;

class Customer
{
private String name;
private int id;

public Customer(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



}

public class Test {

	public static void main(String[] args) {
		
		//int val=100;
		
		Customer c=new Customer("Ravi", 2);
		m1(c);
		//GC
		//System.out.println(val);
		System.out.println(c.getId());
	}

	public static void m1(Customer c)
	{
		c.setId(5);
		c=new Customer("Rahul",7);
		c.setId(9);
		System.out.println(c.getId());
	}
}
