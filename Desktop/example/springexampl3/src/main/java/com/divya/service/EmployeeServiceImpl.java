package com.divya.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.domain.Employee;
import com.divya.service.EmployeeService;
import com.divya.domain.EmployeeDAO;


	@Service("employeeService")
	public class EmployeeServiceImpl implements EmployeeService{

	    @Autowired
	    private DateService dateService;
	    
	    @Autowired
	    private EmployeeDAO employeeDao;

		public void registerEmployee(Employee employee) {
			// TODO Auto-generated method stub
			
			employee.setAssessmentDate(dateService.getNextAssessmentDate());
	        employeeDao.saveInDatabase(employee);
	        
			
		}
	    
	   
	    
	  

}
