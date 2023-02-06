package com.jsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("HelloWorld.xml");
		HelloWorld h=(HelloWorld) context.getBean("myHelloWorld");
		
		System.out.println("Message:"+h.getMessage());
	}

}
