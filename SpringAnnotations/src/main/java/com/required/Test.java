package com.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Student.xml");
		Student s=(Student) context.getBean("myStudent");
		
		System.out.println("Id:"+s.getId());
		System.out.println("Name:"+s.getName());
	}

}
