package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	private Engine engine;
	
	public Car() {
		System.out.println("Car Constructor..");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	

}
