package com.zensar.spring.performers;

/*
 * Author: Varsha
 * Creation Date: 27th Jul 16.21 PM
 * Modified Date: 27th Jul 16.21 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It represents
 * a performer Juggler of Zensar Idol Competition.
 * Juggler gets bean bags using constructor injection.
 */


public class Juggler implements Performers {

	private int beanBags;
	
	
	public Juggler() {
		System.out.println("No. Arg Constructor of juggler");
	}


	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("param constructor of juggler");
	}


	//business logic method of Performer
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler juggling " + beanBags);
	}

}
