package com.sumith.beans.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDISetterOfReferences {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beans.xml");
		
		Student s1 =(Student) context.getBean("student1");
		System.out.println(s1);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getMobile());
		
		System.out.println("\nCollege Details\n");
		
		College cg1 =(College) context.getBean("cg1");
		System.out.println(cg1);
		System.out.println(cg1.getStudent());
		System.out.println(cg1.getName());
		System.out.println(cg1.getStudent().getId());
		System.out.println(cg1.getStudent().getName());
		cg1.getStudent().getMobile().stream().forEach(System.out::println);
		
		
	}
}
