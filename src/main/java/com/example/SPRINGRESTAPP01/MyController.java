package com.example.SPRINGRESTAPP01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/greetings")
	public String getGreetings() {
		System.out.println("welcome dftd fffo my first kpplication  dff..!!!");
		return "Welcome to my  First web application";
	}

}
