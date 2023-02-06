package com.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Profile.xml");
		Profile p=(Profile) context.getBean("myProfile");
		
		System.out.println("ID:"+p.getStudent().getId());
		System.out.println("Name:"+p.getStudent().getName());
	}

}
