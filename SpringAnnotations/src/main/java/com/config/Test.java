package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new 
				AnnotationConfigApplicationContext(DemoConfig.class);
		Demo d=(Demo) context.getBean(Demo.class);
		d.setMessage("Good Morning");
		System.out.println(d.getMessage());
	}

}
