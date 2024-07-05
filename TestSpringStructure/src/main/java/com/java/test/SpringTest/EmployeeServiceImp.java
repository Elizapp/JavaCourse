package com.java.test.SpringTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Lazy
	@Autowired
	EmployeeService employeeService;

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeService.getEmployees();
	}

}
