package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=(Employee) context.getBean("myEmployee");
		System.out.println("Id:"+e.getId());
		System.out.println("Name:"+e.getName());
		System.out.println("Designation:"+e.getDesignation());
		System.out.println("Address:"+e.getAddress());
	}

}
