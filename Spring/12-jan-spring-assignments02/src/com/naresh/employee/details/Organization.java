package com.naresh.employee.details;

public class Organization {
	
	private String organizationName;
	private Address address;
	
	public Organization()
	{
		System.out.println("org created..");
	}
	
	

	public Organization(String organizationName, Address address) {
		super();
		this.organizationName = organizationName;
		this.address = address;
	}



	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Organization [organizationName=" + organizationName + ", address=" + address + "]";
	}
	
	

}
