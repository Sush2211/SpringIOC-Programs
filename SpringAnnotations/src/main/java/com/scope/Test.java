package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new 
				AnnotationConfigApplicationContext(MobileScopeConfig.class);
		
		Mobile m=(Mobile) context.getBean(Mobile.class);
		m.setBrand("One plus ");
		System.out.println(m.getBrand());
		
		Mobile m1=(Mobile) context.getBean(Mobile.class);
		System.out.println(m1.getBrand());
		
		
		Mobile m2=(Mobile) context.getBean(Mobile.class);
		System.out.println(m2.getBrand());
	}

}
