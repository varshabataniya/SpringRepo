package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

/*
 * Author: Varsha
 * Creation Date: 27th Jul 16.52 PM
 * Modified Date: 27th Jul 16.52 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It represents
 * a performer Juggler of Zensar Idol Competition.
 * Juggler gets bean bags using constructor injection.
 */


public class PoeticJuggler extends Juggler{

	private Poem poem;
	
	public PoeticJuggler(){
		System.out.println("No-Arg Construtor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Param Constructor of PoeticJuggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While Reciting a Poem");
		poem.recite();
	}
	
	
	
	
	
}
