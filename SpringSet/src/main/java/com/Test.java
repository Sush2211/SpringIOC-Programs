package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("addressset.xml");
		Address address=(Address) context.getBean("myAddress");
		
		System.out.println("Set Elements:"+address.getAddressSet());
		System.out.println("Zipcode values:"+address.getZipcode());
	}

}
