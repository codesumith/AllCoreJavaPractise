package com.naresh.employee.details;

public class Employee {

	private String name;
	private Integer id;
	private Double salary;
	private Address address;
	private Organization org;
	
	public Employee()
	{
		System.out.println("Employee is created..");
	}

	
	
	public Employee(String name, Integer id, Double salary, Address address, Organization org) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
		this.org = org;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", " + address + ", " + org
				+ "]";
	}
	
	
	
}
