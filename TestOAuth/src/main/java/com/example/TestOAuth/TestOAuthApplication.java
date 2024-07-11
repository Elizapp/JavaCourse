package com.example.TestOAuth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestOAuthApplication {
	
	@GetMapping
	public String menssage() {
		
		return "Welcome to Github";
	}

	@GetMapping("/employee")
	public Principal employee(Principal principal) {
		System.out.println("Emloyee " + principal.getName() );
		return principal;
	}
	public static void main(String[] args) {
		SpringApplication.run(TestOAuthApplication.class, args);
	}

}
