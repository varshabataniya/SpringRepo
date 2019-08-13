package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Hello World
 */

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Greetings.xml");
		
		Greetings g1 = ctx.getBean("birthday",Greetings.class);
		System.out.println(g1.sayGreat());
		
		Greetings g2 = ctx.getBean("holi",Greetings.class);
		System.out.println(g2.sayGreat());
		
		Greetings g3 = ctx.getBean("birthday",Greetings.class);
		//System.out.println(g3.sayGreat());
		
	}
	
}
