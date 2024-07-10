package com.sumith.shopping_cart_using_consumer_interface;

public class CartItem {

	
	private String name;
	private double price;
	private int quantity;
	
	public CartItem(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	double getTotalPrice() {
		return price*quantity;
	}

	@Override
	public String toString() {
		return "CartItem [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
