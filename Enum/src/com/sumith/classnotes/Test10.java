package com.sumith.classnotes;

enum Season{
	
	SPRING("Pleasant"),SUMMER("Unpleasant"),RAINY("Rain"),WINTER;
	
	String msg;
	
	Season(String msg){
		this.msg=msg;
	}
	Season(){
		this.msg="Cold";
	}
	
	public String getMessage() {
		return msg;
		
	}
	
}

public class Test10 {

	public static void main(String[] args) {
		
		Season s1[]=Season.values();
		
		for(Season x:s1) {
			
			System.out.println(x+" is : "+x.getMessage());
			
		}

	}

}
