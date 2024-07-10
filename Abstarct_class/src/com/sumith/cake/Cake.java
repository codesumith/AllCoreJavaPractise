package com.sumith.cake;

abstract class Cake {
	
	private String shape;
	private String flavor;
	private int qty;
	private float price=400;
	
	protected Cake(String shape, String flavor, int qty) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.qty = qty;
	}

	protected String getShape() {
		return shape;
	}

	protected void setShape(String shape) {
		this.shape = shape;
	}

	protected String getFlavor() {
		return flavor;
	}

	protected void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	protected int getQty() {
		return qty;
	}

	protected void setQty(int qty) {
		this.qty = qty;
	}

	protected float getPrice() {
		return price=qty*price;
	}

	protected void setPrice(float price) {
		this.price = price;
	}
	
	protected void showCake() {
		
		System.out.println("A "+ shape+" shape "+ flavor+" flavor Cake Of "+qty+" kg/kg's Ready @ Rs."+getPrice()+"/-");
	}

}
