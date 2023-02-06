package com.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@PostConstruct
	public void init() {
		System.out.println("Init Method Executed..");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy the method..");
	}

}
