package com.example.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@RequestMapping("/dopayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return paymentService.doPayment(payment);
		
	}

}
