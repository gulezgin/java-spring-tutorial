package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ıocConfig.class);
		
		//context.refresh();
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		//CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		customerService.add();

	}

	//IOC - Inversion of Control
	//Dependency Injection
	//Spagetti
	//SOLID
	
	
}
