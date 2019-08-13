package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Performers.xml");
		Performer p = ctx.getBean("Cat",Performer.class);
		p.perform();
	}
}
