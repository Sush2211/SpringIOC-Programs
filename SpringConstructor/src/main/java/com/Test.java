package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("cycle.xml");
		Cycle c=(Cycle) context.getBean("myCycle");
		
		System.out.println("Brand:"+c.brand);
		System.out.println("Cost:"+c.cost);
		System.out.println("NoOfWheels:"+c.noOfWheels);
	}
}
