package com.flipkart.set.values;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDISetterInjectionDemo 
{
@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beans-two.xml");
		Student s1 = (Student) context.getBean("student1");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getSubjects());
		System.out.println(s1.getMarks());
		
		System.out.println("\nSecond Student\n");
		
		Student s2 = (Student) context.getBean("student2");
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getSubjects());
		System.out.println(s2.getMarks());
		
	}
	
}
