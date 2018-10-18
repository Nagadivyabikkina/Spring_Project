package com.divya.domain;

import org.springframework.stereotype.Repository;

@Repository("EmployeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO{

	public void saveInDatabase(Employee employee) {
		// TODO Auto-generated method stub
		
		System.out.println("Employee" + employee.getName() + "is registered for assessment on " +employee.getAssessmentDate());
		
	}
	
	

	
	
}
