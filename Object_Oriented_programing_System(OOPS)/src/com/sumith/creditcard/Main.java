package com.sumith.creditcard;

public class Main {

	public static void main(String[] args) {
		
		Customer cu= new Customer("Anil", 750);
		CardType offeredCard = CardsOnOffer.getOfferedCard(cu);
		System.out.println(offeredCard);
		
		

	}

}
