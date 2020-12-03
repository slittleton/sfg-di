package com.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.controllers.PropertyInjectedController;
import com.spring.services.ConstructorGreetingService;

public class PropertyInjectedControllerTest {
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		
		controller.greetingService = new ConstructorGreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
