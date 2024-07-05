package com.java.test.TestSpirngWithDB;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping("/index")
	public String display(Model model) {
		
		List<Employee> list =employeeService.displayData();
		for(Employee e: list) {
			System.out.print(e.getName());
		}
		model.addAttribute("ref", list);
		return "index.html";
		
	}
	
	@RequestMapping("/employee")
	public void saveData() {
		
		Employee emp = new Employee();
		Scanner scanner = new Scanner(System.in);
		emp.setId(scanner.nextInt());
		emp.setName(scanner.next());
		emp.setAddress(scanner.next());
		emp.setSalary(scanner.nextFloat());
		employeeService.saveData(emp);
	}
}
