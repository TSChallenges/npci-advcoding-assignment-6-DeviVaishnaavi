package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] arg) {
        

	// Step 1: Load Spring context 
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


	// Step 2: Get Product Bean from Spring 
	Product p1 = context.getBean(Product.class);
	p1.setId(1);
	p1.setName("Tumbler");
	p1.setBarcode();
	System.out.println(p1);

	// Step 3: Get another Product Bean from Spring 
	Product p2 = context.getBean(Product.class);
	p2.setId(2);
	p2.setName("Bucket");
	p2.setBarcode();
	System.out.println(p2);
    }  
}