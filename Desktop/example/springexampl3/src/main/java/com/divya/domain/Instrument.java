package com.divya.domain;
import org.springframework.stereotype.Component;

@Component
public class Instrument {
	
	private String name="VEENA";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instrument [name=" + name + "]";
	}
	
	
	


}
