package com.spring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// @Primary sets this as the primary bean for anything implementing GreetingService. If there is no specific 
// service chosen using @Qualifier then spring will default to using the service with @Primary annotation
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello World - From Primary Bean";
	}

}
