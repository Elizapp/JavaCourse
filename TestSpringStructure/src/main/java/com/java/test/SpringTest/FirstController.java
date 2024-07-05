package com.java.test.SpringTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/hi")	
	public String test() {
		System.out.println("hi");
		List<Employee> list = empService.getEmployees();
		return "index";
	}

}
