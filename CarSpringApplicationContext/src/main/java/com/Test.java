package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("car.xml");
		Car c=(Car) context.getBean("myCar"); 
		System.out.println("Brand:"+c.getBrand());
		System.out.println("Cost:"+c.getCost());
		System.out.println("Color:"+c.getColor());
	}

}
