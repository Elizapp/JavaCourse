package com.example.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {
	@Autowired
	RestTemplate template;
	
	@GetMapping("/account-payment/{price}")
	public String invokePayment(@PathVariable int price) {
		String url="http://localhost:8990/fee-provider/paynow/" + price;
		return template.getForObject(url, String.class);
	}

}
