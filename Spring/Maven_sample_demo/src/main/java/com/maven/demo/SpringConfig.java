package com.maven.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Order getOrder()
	{
		Order o =new Order();
		o.setoId(123);
		o.setPrice(4000);
		
		return o;
	}

}
