package com.sumith.Creating_objects;

public class Camera {
	
	
	String Company;
	 String   megapixel;
	 String pictureQuality;
	 String modelNumber;
	 int price;
	 
	 public void getCameraDetails() {
		 System.out.println("Camera company name:"+Company);
		 System.out.println("Camera megapixels:"+megapixel);
		 System.out.println("Camera picture quality:"+pictureQuality);
		 System.out.println("Camera  moddel number:"+modelNumber);
	 }

	 public void price() {
		 System.out.println("Camera price:"+price);
	 }
	public static void main(String[] args) {
		Camera c= new Camera();
		c.Company="Sony";
		c.megapixel="33MP";
		c.pictureQuality="4k";
		c.modelNumber="ILCE-7M4/ILCE-7M4K";
		c.price=45000;
		c.getCameraDetails();
		c.price();
		
		
		

	}

}
