package com.sumith.phone_simcard_intercation;

public class MobilePhone implements MobilePhoneInterface {
public String networkProvider;


	public MobilePhone(String networkProvider) {
	super();
	this.networkProvider = networkProvider;
}

	@Override
	public void inserting() {
		// TODO Auto-generated method stub
		
		System.out.println(networkProvider+" sim inserted");
		
	}

	@Override
	public void removing() {
		// TODO Auto-generated method stub
		System.out.println(networkProvider+" sim removed ");
		
	}

	@Override
	public void makingCall(String s) {
		// TODO Auto-generated method stub
		System.out.println("Making call to "+s);
		
	}

	@Override
	public void sendingMessage(String s) {
		// TODO Auto-generated method stub
		System.out.println("Sending message to "+s);
		
	}

}
