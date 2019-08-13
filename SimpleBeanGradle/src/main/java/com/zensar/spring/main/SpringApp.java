package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zensar.spring.simple.Greetings;

public class SpringApp {

	public static void main(String[] args) {
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("Greetings.xml");
	
	Greetings p = ctx.getBean("tina",Greetings.class);
	
	System.out.println(	p.sayGreet());
	
	}
}
