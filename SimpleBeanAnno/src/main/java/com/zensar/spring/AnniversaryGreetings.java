package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
public class AnniversaryGreetings implements Greetings {

	public AnniversaryGreetings() {
		// TODO Auto-generated constructor stub
		System.out.println("Anniversary Greetings is Created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Congratulations";
	}

}
