package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("MobileCar.xml");
		Mobile m=(Mobile) context.getBean("myMobile");
		
		System.out.println("Brand:"+m.getBrand());
		System.out.println("Network:"+m.s.getNetwork());
	}

}
