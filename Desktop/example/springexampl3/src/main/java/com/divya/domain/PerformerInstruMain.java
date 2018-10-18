package com.divya.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.divya.config.AppConfig;

public class PerformerInstruMain {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Performer perform =(Performer)context.getBean("performer");
		System.out.println(perform);
		
	}

}
