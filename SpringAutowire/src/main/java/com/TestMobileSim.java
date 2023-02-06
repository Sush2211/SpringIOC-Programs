package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobileSim {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("MobileSim.xml");
		Mobile m=(Mobile) context.getBean("myMobile");
		
		System.out.println("Brand:"+m.getBrand());
		System.out.println("Name:"+m.getSim().getSimName());
		System.out.println("Network Type:"+m.getSim().getNetworkType());
	}

}
