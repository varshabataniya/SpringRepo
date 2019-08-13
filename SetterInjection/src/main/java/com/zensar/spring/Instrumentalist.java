package com.zensar.spring;

import com.zensar.spring.performers.Instrument;

public class Instrumentalist implements Performer{

	private String song;
	private Instrument instrument;
	
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
		System.out.println("Instrumentalist is playing " + song);
	}
}
