package com.sumith.shopping_cart_using_consumer_interface;



public class Tester implements Consumer{
	
	
	@Override
	public void applyDiscount(ShoppingCart cart) {
		 double totalPrice=cart.getItems().getTotalPrice();
		 
		 if(totalPrice>1000000) {
			 
			 double discountedPrice=totalPrice*0.9;
			 System.out.println("Before discount : "+cart);
			 System.out.println("Total price : "+totalPrice);
			 System.out.println("Applying 10% discount...");
			 System.out.println("After discount : "+cart.getItems());
			 System.out.println("Discounted Price : "+discountedPrice);
			 
		 }
		 else {
			 System.out.println("No discount applied.\n"+cart);
			 System.out.println("Total Price : "+totalPrice);
		 }
		
	}


	public static void main(String[] args) {
		
		CartItem c=new CartItem("Hidenseek", 30, 2);
		ShoppingCart sc=new ShoppingCart(c);
		
	     Tester t =new Tester();
	     t.applyDiscount(sc);

	     CartItem c1=new CartItem("gold", 1000000, 2);
			ShoppingCart sc1=new ShoppingCart(c1);
			t.applyDiscount(sc1);
	
	}
	
}


	
