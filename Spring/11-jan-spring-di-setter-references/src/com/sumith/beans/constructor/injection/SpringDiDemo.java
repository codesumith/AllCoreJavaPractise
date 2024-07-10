package com.sumith.beans.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDiDemo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-di-constructor.xml");
		
		Employee e1 =(Employee) context.getBean("employee1");
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		
	}

}
