package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		//CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		customerService.add();

	}

	//IOC - Inversion of Control
	//Dependency Injection
	//Spagetti
	//SOLID
	
	
}
