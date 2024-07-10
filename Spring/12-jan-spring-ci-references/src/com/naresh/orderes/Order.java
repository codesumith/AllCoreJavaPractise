package com.naresh.orderes;

import java.util.List;
import java.util.Map;

public class Order {
	
	
	private Integer Order;
	private String name;
	private boolean isOrderSuccess;
	private Character foodType;
	private List<String> foodItemNames;
	
	private Map<String,Double> prices;
	

	public Order(List<String> foodItemNames, Map<String, Double> prices) {
		super();
		System.out.println("Prices and Menu");
		this.foodItemNames = foodItemNames;
		this.prices = prices;
	}

	//3 params
	
	public Order(Integer order, String name, boolean isOrderSuccess) {
		super();
		Order = order;
		this.name = name;
		this.isOrderSuccess = isOrderSuccess;
	}

	//all params
	
	public Order(Integer order, String name, boolean isOrderSuccess, Character foodType, List<String> foodItemNames,
			Map<String, Double> prices) {
		super();
		Order = order;
		this.name = name;
		this.isOrderSuccess = isOrderSuccess;
		this.foodType = foodType;
		this.foodItemNames = foodItemNames;
		this.prices = prices;
	}

	//2 params
	
	public Order(Character foodType, List<String> foodItemNames) {
		super();
		this.foodType = foodType;
		this.foodItemNames = foodItemNames;
	}

	public Integer getOrder() {
		return Order;
	}

	public void setOrder(Integer order) {
		Order = order;
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
		return "Order [Order=" + Order + ", name=" + name + ", isOrderSuccess=" + isOrderSuccess + ", foodType="
				+ foodType + ", foodItemNames=" + foodItemNames + ", prices=" + prices + "]";
	}
		

}
