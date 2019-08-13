package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Greetings.xml");
		Greetings festivalGreetings =  ctx.getBean("festivalGreetings",Greetings.class);
		System.out.println(festivalGreetings.sayGreet());
		
	}
}
