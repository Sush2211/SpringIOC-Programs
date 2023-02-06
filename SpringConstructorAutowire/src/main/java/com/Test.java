package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BankPerson.xml");
		Bank b=(Bank) context.getBean("myBank");
		System.out.println("Bank Name:"+b.bankName);
	}

}
