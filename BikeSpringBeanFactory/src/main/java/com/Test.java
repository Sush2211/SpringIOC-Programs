package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("bike.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Bike b=(Bike) bf.getBean("myBike");
		
		System.out.println("Brand:"+b.getBrand());
		System.out.println("Color:"+b.getColor());
		System.out.println("Cost:"+b.getCost());
		
		System.out.println("---------------------------");
		
		Resource r1=new ClassPathResource("bike.xml");
		BeanFactory bf1=new XmlBeanFactory(r);
		Bike b1=(Bike) bf.getBean("myBike1");
		
		System.out.println("Brand:"+b1.getBrand());
		System.out.println("Color:"+b1.getColor());
		System.out.println("Cost:"+b1.getCost());
	}

}
