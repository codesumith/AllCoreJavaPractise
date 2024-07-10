package com.sumith.beans.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDISetterOfReferences {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beans.xml");
		
//		Student stu =(Student) context.getBean("student1");
//		System.out.println(stu);
//		System.out.println(stu.getId());
//		System.out.println(stu.getName());
//		stu.setName("ABC");
		
		
		College clg =(College) context.getBean("college1");
		System.out.println(clg);
		System.out.println(clg.getClgName());
		
		
		Student student =clg.getStudent();
		System.out.println(student.getName());
		System.out.println(clg.getStudent().getName());
		
	}

}
