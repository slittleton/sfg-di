package com.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.controllers.ConstructorInjectedController;
import com.spring.services.ConstructorGreetingService;

public class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
	
}
