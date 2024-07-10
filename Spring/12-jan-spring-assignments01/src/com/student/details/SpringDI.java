package com.student.details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDI {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beans.xml");
		
		Student student = (Student) context.getBean("student1");
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		 student.getMarks().entrySet().stream().forEach(System.out::println);
		 
		 
		 student =  (Student) context.getBean("student2");
		 System.out.println(student);
		
		
		
	}

}
