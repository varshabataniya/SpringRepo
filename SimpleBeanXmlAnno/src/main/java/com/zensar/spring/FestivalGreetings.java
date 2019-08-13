package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
public class FestivalGreetings implements Greetings {

	public FestivalGreetings() {
		// TODO Auto-generated constructor stub
		System.out.println("Festival Greetings Created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi";
	}

}
