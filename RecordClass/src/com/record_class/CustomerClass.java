package com.record_class;

import java.util.Objects;

public class CustomerClass {
	
	private int customerId;
	private String customerName;
	private double coustomerBill;
	
	public CustomerClass(int customerId, String customerName, double coustomerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.coustomerBill = coustomerBill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coustomerBill, customerId, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerClass other = (CustomerClass) obj;
		return Double.doubleToLongBits(coustomerBill) == Double.doubleToLongBits(other.coustomerBill)
				&& customerId == other.customerId && Objects.equals(customerName, other.customerName);
	}

	@Override
	public String toString() {
		return "CustomerClass [customerId=" + customerId + ", customerName=" + customerName + ", coustomerBill="
				+ coustomerBill + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCoustomerBill() {
		return coustomerBill;
	}

	public void setCoustomerBill(double coustomerBill) {
		this.coustomerBill = coustomerBill;
	}
	
	

}
