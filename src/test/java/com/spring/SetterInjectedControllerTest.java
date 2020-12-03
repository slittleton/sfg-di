package com.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;

import com.spring.controllers.SetterInjectedController;
import com.spring.services.ConstructorGreetingService;


public class SetterInjectedControllerTest {
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
