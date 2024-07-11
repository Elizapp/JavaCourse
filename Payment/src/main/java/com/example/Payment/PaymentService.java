package com.example.Payment;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepo paymentRepo;
	
	public Payment doPayment(Payment payment) {
		
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}

}
