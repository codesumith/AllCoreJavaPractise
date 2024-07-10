package com.spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Creating Spring Container Object + Provided XML file Details to container
		
		BeanFactory container =new FileSystemXmlApplicationContext("beans.xml");
		
		Object obj =container.getBean("s1");
		
		Student student = (Student)obj; 
		
		student.printStudentDetails();
		
		obj= container.getBean("e1");
	
		Employee employee = (Employee)obj;
		
		employee.printEmp();
	}

}
