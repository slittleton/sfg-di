package com.spring.controllers;

import org.springframework.stereotype.Controller;

import com.spring.services.GreetingService;

@Controller
public class MyController {
	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {

		return "Hello World Printing from my controller";
	}
}
