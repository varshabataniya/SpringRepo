package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem{

	private final static String LINES [] = {
			"Twinkle ",
			 "Twinkle",
			 "Little",
			 "Star"
	};
	
	public void recite(){
		for(String line: LINES)
			System.out.println(line);
	}
}
