package com.sumith.phone_simcard_intercation;

public class Jio implements Simcard{
 private String phnNumber;
 private String networkProvider="Jio";
 
 
 

	public Jio(String phnNumber) {
	super();
	this.phnNumber = phnNumber;
	
}

	@Override
	public void getPhoneNumber() {
		// TODO Auto-generated method stub
		System.out.println("Your Phn number is : "+phnNumber);
		
	}

	@Override
	public String networkProvider() {
		// TODO Auto-generated method stub
		return networkProvider;
	}

	@Override
	public void activation() {
		// TODO Auto-generated method stub
		System.out.println("Your "+networkProvider+" simcard Activated");
		
	}

	@Override
	public void deactivation() {
		// TODO Auto-generated method stub
		
		System.out.println("Your "+networkProvider+" simcard Deactivated");
		
	}

}
