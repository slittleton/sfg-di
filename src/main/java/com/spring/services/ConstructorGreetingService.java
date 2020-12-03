package com.spring.services;

import org.springframework.stereotype.Service;

// @Service tells spring this is a managed component and bring it into spring context
@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor";
	}

}
