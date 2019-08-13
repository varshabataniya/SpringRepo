package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Performer p = ctx.getBean("Varsha", Performer.class);
		p.perform();
		
		ConfigurableApplicationContext cfgCtx = (ConfigurableApplicationContext) ctx;
		
		// shutting down Spring IoC Container
		cfgCtx.close();
	}
}
