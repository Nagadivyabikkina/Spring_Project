package com.divya.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("performer")
public class Performer {
	
	private Instrument instrument;
	
	@Autowired
	private Performer(Instrument instrument)
	{
		this.instrument =instrument;
	}

	@Override
	public String toString() {
		return "Performer [instrument=" + instrument + "]";
	}
	

}
