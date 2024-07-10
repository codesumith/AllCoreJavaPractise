package com.spring.bean.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeanScopesDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext container = new FileSystemXmlApplicationContext("beans.xml");
		
		Employee emp1 = (Employee) container.getBean("e1");
		System.out.println(emp1);
		emp1.setName("Stanza");
		
		Employee emp2 = (Employee) container.getBean("e1");
		System.out.println(emp2);
		
		System.out.println(emp2.getName());
		
		
		System.out.println("e2 bean object");
		
		Employee emp3 =(Employee) container.getBean("e2");
		System.out.println(emp3);
		
	   System.out.println(emp3.getName());
	   emp3.setName("Living");
	   
	   
	   Employee emp4 =(Employee) container.getBean("e2");
		System.out.println(emp4);
		
	   System.out.println(emp3.getName());
	   System.out.println(emp4.getName());

	   Employee emp5 =(Employee) container.getBean("e2");
		System.out.println(emp5);
		
	   System.out.println(emp5.getName());

	}

}
