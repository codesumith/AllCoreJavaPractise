package com.sumith.comparable_comparator_sortedset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		
ArrayList<Product> al=new ArrayList<Product>();

al.add(new Product(3, "Camera", 16450.89));
al.add(new Product(2,"Laptop",76450.78));
al.add(new Product(1,"Mobile",22670.09));

//sorting based on productId
Comparator<Product> prodId =new Comparator<>()
{

	@Override
	public int compare(Product p1, Product p2) {
		
		//return p1.getProductId()-p2.getProductId();
		//return p1.getProductId().compareTo(p2.getProductId());
		return Integer.compare(p1.getProductId(), p2.getProductId());
	}
	
};

Collections.sort(al, prodId);
System.out.println("Sorting based on productId.");

al.forEach(prod -> System.out.println(prod));

System.out.println("Sorting based on product name");
Comparator<Product> ctr=new Comparator<Product>() {
	
	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getProductName().compareTo(p2.getProductName());
		
	}
};

Collections.sort(al,ctr);

System.out.println("Sorting based on the product name :");

al.forEach(prd -> System.out.println(prd));

System.out.println("Sorting based on price");

Comparator<Product> ct= new Comparator<Product>() {
	
	@Override
	public int compare(Product o1, Product o2) {
		
		//return Double.compare(o1.getProductPrice(), o2.getProductPrice());
		return o1.getProductPrice().compareTo(o2.getProductPrice());
	}
};

Collections.sort(al,ct);
System.out.println("Sorting based on price");
al.forEach(e -> System.out.println(e));
	}

}
