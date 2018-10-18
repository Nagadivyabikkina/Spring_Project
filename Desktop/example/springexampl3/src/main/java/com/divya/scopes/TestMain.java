package com.divya.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.divya.config.AppConfig2;

public class TestMain {
	
	public static void main(String[] args) {
		
	
	
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
	
	TestService t1=(TestService) context.getBean("testService");
	t1.setService("AWS");
	System.out.println(t1.getService());
	
	TestService t2=(TestService) context.getBean("testService");
	t2.setService("Some");
	System.out.println(t2.getService());
	}
			
}
