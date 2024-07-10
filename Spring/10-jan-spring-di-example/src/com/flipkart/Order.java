package com.flipkart;

import java.util.ArrayList;
import java.util.List;

public class Order 
{

	private String emailId;
	private float totalAmount;
	private boolean isOrderSuccess;
	private char foodType;
	private long mobileNumber;
	
	private ArrayList<String> foodItemNames;
	private List<Double> prices;
	
	public Order()
	{
		System.out.println("Order Created..");
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public boolean getIsOrderSuccess() {
		return isOrderSuccess;
	}

	public void setIsOrderSuccess(boolean isOrderSuccess) {
		this.isOrderSuccess = isOrderSuccess;
	}

	public char getFoodType() {
		return foodType;
	}

	public void setFoodType(char foodType) {
		this.foodType = foodType;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public ArrayList<String> getFoodItemNames() {
		return foodItemNames;
	}

	public void setFoodItemNames(ArrayList<String> foodItemNames) {
		this.foodItemNames = foodItemNames;
	}
	
	public List<Double> getPrices() {
		return prices;
	}

	public void setPrices(List<Double> prices) {
		this.prices = prices;
	}

	@Override
	public String toString() {
		return "Order [emailId=" + emailId + ", totalAmount=" + totalAmount + ", isOrderSuccess=" + isOrderSuccess
				+ ", foodType=" + foodType + ", mobileNumber=" + mobileNumber + ",\n"
						+ "foodItems=" + foodItemNames + ",\n"
						+ "prices=" + prices +"]";
	}
	
}
