package com.zensar.spring.performers;


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

public class Guitar implements Instrument {

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("ting.. ting...");
	}

	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("ting.. ting...");
	}

	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is clean");
	}
	
}
