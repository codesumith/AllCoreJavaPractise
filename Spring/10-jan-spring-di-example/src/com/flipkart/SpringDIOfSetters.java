package com.flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.flipkart.set.values.Student;

public class SpringDIOfSetters 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	
		  ApplicationContext context = new
		  FileSystemXmlApplicationContext("spring-beans.xml");
		  
		  Product p1= (Product) context.getBean("product1");
		  System.out.println(p1.toString());
		  
		  Product p2= (Product) context.getBean("product2");
		  System.out.println(p2.toString());
		  
		  System.out.println("\nOrder Data.....\n");
		  
		  Order or1=(Order) context.getBean("order1");
		  System.out.println(or1.toString());
		  
		  System.out.println("\nStudnet Data.....\n");
		  Student s1 = (Student) context.getBean("student1");
		  System.out.println(s1.getId());
		  System.out.println(s1.getName());
		  System.out.println(s1.getSubjects());
		  
	}
	
}
