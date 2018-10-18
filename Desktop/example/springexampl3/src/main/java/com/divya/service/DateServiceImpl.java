package com.divya.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
@Service("dataservice")
public class DateServiceImpl implements DateService{

	public LocalDate getNextAssessmentDate() {
		// TODO Auto-generated method stub
		return LocalDate.of(2018,10,11);
	}
	
}
