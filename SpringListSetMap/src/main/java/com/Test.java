package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		Student s=(Student) context.getBean("myStudent");
		System.out.println("Id:"+s.getId());
		System.out.println("Name:"+s.getName());
		System.out.println("Address:"+s.getAddress());
	}

}
