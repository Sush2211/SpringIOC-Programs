package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("VehicleCarBeans.xml");
		
		Vehicle v=(Vehicle) context.getBean("myVehicle");
		System.out.println("Vehicle_Color:"+v.getColor());
		
		Car c=(Car) context.getBean("myCar");
		System.out.println("Brand:"+c.getBrand());
		System.out.println("Car_Color:"+c.getColor());
	
	}

}
