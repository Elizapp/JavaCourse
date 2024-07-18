package com.example.FeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fee-provider")
public class FeeController {
	
	@GetMapping("/paynow/{price}")
	public String payNow(@PathVariable int price) {
		
		return "payment with" + price + "received";
	}

}
