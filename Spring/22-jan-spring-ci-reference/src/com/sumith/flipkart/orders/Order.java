package com.sumith.flipkart.orders;

import java.util.List;
import java.util.Map;

public class Order {
	
	private int orderId;
	private String name;
	private boolean isOrderSuccess;
	private Character foodType;
	private List<String> foodItemNames;
	
	
	private Map<String,Double> prices;
	
	
    //2 params
    public Order(Character foodType, List<String> foodItemNames) {
		super();
		this.foodType = foodType;
		this.foodItemNames = foodItemNames;
	}

    //2 params
    
    public Order(List<String> foodItemNames, Map<String, Double> prices) {
		super();
		this.foodItemNames = foodItemNames;
		this.prices = prices;
	}

	//3 params
	public Order(int orderId, String name, boolean isOrderSuccess) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.isOrderSuccess = isOrderSuccess;
	}

	//all params
	public Order(int orderId, String name, boolean isOrderSuccess, Character foodType, List<String> foodItemNames,
			Map<String, Double> prices) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.isOrderSuccess = isOrderSuccess;
		this.foodType = foodType;
		this.foodItemNames = foodItemNames;
		this.prices = prices;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOrderSuccess() {
		return isOrderSuccess;
	}

	public void setOrderSuccess(boolean isOrderSuccess) {
		this.isOrderSuccess = isOrderSuccess;
	}

	public Character getFoodType() {
		return foodType;
	}

	public void setFoodType(Character foodType) {
		this.foodType = foodType;
	}

	public List<String> getFoodItemNames() {
		return foodItemNames;
	}

	public void setFoodItemNames(List<String> foodItemNames) {
		this.foodItemNames = foodItemNames;
	}

	public Map<String, Double> getPrices() {
		return prices;
	}

	public void setPrices(Map<String, Double> prices) {
		this.prices = prices;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", isOrderSuccess=" + isOrderSuccess + ", foodType="
				+ foodType + ", foodItemNames=" + foodItemNames + ", prices=" + prices + "]";
	}

	
   
}
