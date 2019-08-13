package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performers;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Performers p = ctx.getBean("Cat",Performers.class);
		p.perform();
		
		System.out.println();
		
		Performers p1 = ctx.getBean("Dog",Performers.class);
		p1.perform();
	}
}
