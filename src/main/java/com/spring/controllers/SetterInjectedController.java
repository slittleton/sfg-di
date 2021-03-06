package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.services.GreetingService;

@Controller
public class SetterInjectedController {
	private GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

	@Qualifier("setterGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
