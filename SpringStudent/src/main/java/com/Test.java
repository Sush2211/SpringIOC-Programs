package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("stud.xml");
		Student s=(Student) context.getBean("myStud");
		System.out.println("Id:"+s.getId());
		System.out.println("Name:"+s.getName());
		System.out.println("EmailId:"+s.getEmailId());
		
	}

}
