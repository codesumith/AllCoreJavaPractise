package com.sumith.override_interface_method_in_anonymus_inner_class;

public class AnnonymusInner {

	public static void main(String[] args) {
		
Vehicle car=new Vehicle() {

	@Override
	public void run() {
		System.out.println("Car is running");
		
	}
	
	
};
car.run();

Vehicle bike =new Vehicle() {
	@Override
	public void run() {
		System.out.println("Bike is running");
	}
};
bike.run();
	}

}
