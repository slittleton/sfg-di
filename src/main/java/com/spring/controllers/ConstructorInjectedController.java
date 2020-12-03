package com.spring.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.spring.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	private final GreetingService greetingService;

	//@Autowired annotation is not needed for spring constructor injection starting with spring 4
	//@Qualifier tells spring to use a specific service instead of just any @Service that implements GreetingService interface
	//if you have multiple services that implement the same interface then this is necessary or spring wont know which service to choose
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	public String getGreeting() {
		return greetingService.sayGreeting();
		
	}
}
