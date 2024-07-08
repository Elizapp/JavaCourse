package com.java.test.TestSpirngWithDB;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping("/")
	public String display(Model model) {
		
		List<Employee> list =employeeService.displayData();
		for(Employee e: list) {
			System.out.print(e.getName());
		}
		model.addAttribute("ref", list);
		return "index.html";
		
	}
	
	@RequestMapping("/add")
	public String saveData(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp", emp); 
	return "add_data";
	}
	
	@RequestMapping(value= "/new", method = RequestMethod.POST)
	public String calledSave(@ModelAttribute("emp") Employee emp) {
		
		employeeService.saveData(emp);
		System.out.print("Called without add");
		return "redirect:/";
	}
	
	@RequestMapping("/editEmp/{id}")
	public ModelAndView showEditEmp(@PathVariable(name = "id") Long id) {
		ModelAndView view = new ModelAndView("edit_emp");
		Employee emp= employeeService.getEmp(id);
		System.out.println(emp.getName());
		view.addObject("emp", emp);
		return view;
		
	}
	
}
