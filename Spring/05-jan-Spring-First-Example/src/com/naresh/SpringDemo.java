package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		
		BeanFactory container = new FileSystemXmlApplicationContext("web.xml");
		
		    Object obj = container.getBean("s1");
		    
		    Student student =(Student) obj;
		    
		    student.printStudentInformation();
		    
		    obj =container.getBean("emp1");
		    
		    Employee employee = (Employee)obj;
		    
		    employee.printEmpInfo();
		
	}

}
