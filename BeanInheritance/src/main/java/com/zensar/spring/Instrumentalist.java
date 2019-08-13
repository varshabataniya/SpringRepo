package com.zensar.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 * Author: Varsha
 * Creation Date: 27th Jul 04.18 PM
 * Modified Date: 29th Jul 2.30 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is used to represent
 * 
 * It also shows bean LifeCycle in Spring. 
 */


import com.zensar.spring.performers.Instrument;

/*
 * Author: Varsha
 * Creation Date: 27th Jul 12.51 PM
 * Modified Date: 27th Jul 12.51 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: 
 * 
 */

public class Instrumentalist implements Performer,BeanNameAware{

	private String song;
	private Instrument instrument;
	private String beanName;
	
	public void setSong(String song){
		this.song = song;
		System.out.println("Song is set");
	}
	
	public void setInstrument(Instrument instrument){
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}

	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist " + beanName + " is playing " + song);
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		System.out.println("Bean name is set...");
		
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Core IoC Container BeanFactory is set ");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Specialised IoC Container ApplicationContext is set ");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		instrument.tune();
		System.out.println("afterPropertiesSet is called");
	}
	
	public void tuneInstrument(){
		instrument.tune();
		System.out.println("custom init method");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//instrument.clean();
		System.out.println("destroy method is called");
	}
	
	public void cleanInstrument(){
		instrument.clean();
		System.out.println("Custom destroy method");
	}
}
