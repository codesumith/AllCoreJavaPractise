package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//CreatingSpringContainerObject + Provided XML file details to container
		BeanFactory container = new FileSystemXmlApplicationContext("beans.xml");
		
		Object obj =container.getBean("s1");
		//TypeCasting
		Student student =(Student) obj;
		System.out.println("s1 Bean Object"+student);
		student.printStudentInformation();
		
		obj=container.getBean("empOne");
		
		Employee employee =(Employee) obj;
		employee.printEmpInfo();
		
		obj =container.getBean("s2");
		Student student2=(Student) obj;
		student2.printStudentInformation();
		

	}

}
