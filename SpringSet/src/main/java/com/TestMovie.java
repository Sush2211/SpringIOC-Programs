package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMovie {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Movieset.xml");
		Movie m=(Movie) context.getBean("myMovie");
		
		System.out.println("MovieName:"+m.getMovieName());
		System.out.println("MovieType:"+m.getType());
		System.out.println("MovieLanguage:"+m.getLanguage());
	}

}
