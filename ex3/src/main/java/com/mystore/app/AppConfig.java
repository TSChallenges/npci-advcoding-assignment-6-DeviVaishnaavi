package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mystore.app")  // ✅ Tells Spring to look in this package
public class AppConfig { 


//	@Bean
//	public Product product() { 
//		return new Product();	// Create and return Product bean
//
//	}

}



