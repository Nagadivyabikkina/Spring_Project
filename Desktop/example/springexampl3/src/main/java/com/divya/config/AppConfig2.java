package com.divya.config;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.divya.scopes.TestService;

@Configuration
//@ComponentScan(basePackages="com.divya")
public class AppConfig2 {
	
	@Bean(name="testService")
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TestService getService()
	{
		return new TestService();
	}
	

}
