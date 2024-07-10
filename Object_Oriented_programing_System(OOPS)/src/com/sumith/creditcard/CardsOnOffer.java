package com.sumith.creditcard;

public class CardsOnOffer {
	
	
	public static CardType getOfferedCard(Customer object) {
		
		//int cdPoints =object.getCreditPoints();
		
//		String cardType;
		if(object.getCreditPoints()>=100 && object.getCreditPoints()<=500) 
		{
			
		return new CardType(object, "Silver");
			//cardType="silver";
			
		}
		
		else if(object.getCreditPoints()>=501 && object.getCreditPoints()<=1000) 
		{
			
			return new CardType(object, "Gold");
			//cardType="Gold";
		}
		
		else if(object.getCreditPoints()>1001 ) 
		{
			
			return new CardType(object, "Platinum");
			//cardType="Platinum";
			
		}
		
		else
		{
			
			return new CardType(object, "EMI");
			//cardType="EMI";
			
			
		}
		
//		 CardType cT=new CardType(object, cardType);
//		 return cT;
			
	}

}
