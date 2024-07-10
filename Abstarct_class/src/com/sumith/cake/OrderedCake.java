package com.sumith.cake;

public class OrderedCake extends Cake{
	
	private String message;
	
	public OrderedCake() {
		
		super("Round","Vanilla",1);
		
	}
	
	public OrderedCake(String shape, String flavor, int qty) {
		super(shape,flavor,qty);
		
	}

	public OrderedCake(String shape, String flavor, int qty,String message) {
		super(shape,flavor,qty);
		this.message=message;
		
	}
	
	@Override
	public void showCake() {
		
		if(message!=null && message!=" ") {
			
			System.out.println("A "+super.getShape()+" Shape "+ super.getFlavor()+" flavor Cake of "+super.getQty()+"Kg/kg's ready with "+message+"@ Rs."+super.getPrice()+"/-"
					);
		}
		else {
			super.showCake();
		}
	}
	
	

}
