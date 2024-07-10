package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeansDemo 
{
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) 
	{
		
		BeanFactory cotainer =new FileSystemXmlApplicationContext("beans.xml");
		
		ApplicationContext context =new FileSystemXmlApplicationContext("beans.xml");
		
		System.out.println("Getting bean object ");
		
		Object obj = context.getBean("empOne");
		
	}

}
