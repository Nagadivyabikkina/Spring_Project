package com.divya.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.divya.config.AppConfig;
import com.divya.config.AppConfig2;
import com.divya.service.EmployeeService;

public class EmployeeMain {

	
public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig2.class);
		
		EmployeeService service= (EmployeeService)
				context.getBean("employeeService");
		Employee employee=new Employee();
		
		employee.setName("Jason LastName");
		service.registerEmployee(employee);
		context.getClass();
}
}
