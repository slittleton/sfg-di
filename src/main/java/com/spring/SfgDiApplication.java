package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.controllers.ConstructorInjectedController;
import com.spring.controllers.I18nController;
import com.spring.controllers.MyController;
import com.spring.controllers.PropertyInjectedController;
import com.spring.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		// using @Primary in the MyController class designates it as a default bean choice for service implementing GreetingService interface
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("----Primary Bean Injected: " + myController.sayHello());
		

		// These beans are injected using @Qualifier on the service implementing GreetingService interface
		// Property Injected Controller
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("----Property Injected: " + propertyInjectedController.getGreeting());
		
		// Setter Injected Controller
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("----Setter Injected: " + setterInjectedController.getGreeting());
		
		// Constructor Injected Controller
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("----Constructor Injected: " + constructorInjectedController.getGreeting());
		
		
		
		
		
	}

}
