package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Product product1() { 
		Product p = new Product();
		p.setId(1);
		p.setName("Tumbler");
		return p;
		}

	@Bean
	public Product product2() { 
		Product p = new Product();
		p.setId(2);
		p.setName("Bucket");
		return p;
		}
}