package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld h=(HelloWorld) context.getBean("myHello");
		System.out.println(h.getMessage());
	
	}
}
