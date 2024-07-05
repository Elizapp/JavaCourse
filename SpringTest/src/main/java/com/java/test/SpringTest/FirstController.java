package com.java.test.SpringTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {
	
		@RequestMapping("/hi")	
		public String test() {
			//List<Employee> list = 
			System.out.println("hi");	
			return "index";
		}

}
