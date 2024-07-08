package com.java.test.TestSpirngWithDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> displayData() {
		List<Employee> list = employeeRepository.findAll();
		System.out.print(list);
		return list;
	}
	

	public void saveData(Employee emp) {
		
		employeeRepository.save(emp);
		
	}
	public Employee getEmp(long id) {
		return employeeRepository.findById(id).get();
	}
}
