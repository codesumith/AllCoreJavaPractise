package com.naresh.employee.details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDI {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Employee e1 = (Employee) context.getBean("employee1");
		System.out.println(e1);
		
		Employee e2=(Employee) context.getBean("employee2");
		System.out.println(e2);
		
	}

}
