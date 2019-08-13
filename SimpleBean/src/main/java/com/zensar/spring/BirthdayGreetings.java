package com.zensar.spring;

/*
 * Author: Varsha
 * Creation Date: 27th Jul 12.51 PM
 * Modified Date: 27th Jul 12.51 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is specialised greetings used to greet anybody on occassion of birthday.
 * 
 */

public class BirthdayGreetings implements Greetings {

		public BirthdayGreetings() {
			// TODO Auto-generated constructor stub
			System.out.println("Birthday Greetings Created");
		}
	
	public String sayGreat() {
		// TODO Auto-generated method stub
		return "Wish you a very Happy Birthday..!";
	}

}
