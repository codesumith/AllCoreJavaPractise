package com.sumith.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan("com.naresh.students")
//@ComponentScan("com.*")
@ComponentScan
@Configuration
public class SpringBeanConfiguration {

	@Bean
	public Order createOrderOne()
	{
		Order o1= new Order();
		o1.setoId(123);
		o1.setPrice(2000.0);
		
		return o1;
	}
	
	@Bean
	public Products createProductOne()
	{
		return new Products();
	}
	
}
