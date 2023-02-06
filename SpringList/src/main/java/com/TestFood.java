package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFood {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("FoodItems.xml");
		FoodItems f=(FoodItems) context.getBean("myFood");
		
		System.out.println("FoodName:"+f.getFoodName());
		System.out.println("Category:"+f.getCategory());
		System.out.println("Cost:"+f.getCost());
		System.out.println("---------------------------------");
		
		System.out.println(f.getCategory().get(1)+" "+f.getFoodName().get(2)+" "+f.getCost().get(3));
	}

}
