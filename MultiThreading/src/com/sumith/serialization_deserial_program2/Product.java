package com.sumith.serialization_deserial_program2;

import java.io.*;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Product implements Serializable{

	
	private transient Integer productId;  //this will not serialized it will provide null value ;
	private String productName;
	private double productPrice;
	
	
	public Product(Integer productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	@SuppressWarnings("resource")
	public static Product getProductObject()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter product ID :");
		int id=sc.nextInt();
		
		System.out.print("Enter product name :");
		String name=sc.next();
		
		System.out.print("Enter product price :");
		double price=sc.nextDouble();
		
		return new Product(id,name,price);
		
		
	}
}
