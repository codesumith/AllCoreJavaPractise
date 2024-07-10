package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.spring.annotations")
@Configuration
public class BeanConfiguration {
	
	@Bean("p")
	public Product getProduct()
	{
		System.out.println("In get Product method.");
		Product p = new Product();
		p.setId(123);
		return p;
	}

}
