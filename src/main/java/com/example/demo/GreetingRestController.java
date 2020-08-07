package com.example.demo;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingRestController {

	@GetMapping("/greeting")
	String greet(Principal p) {
		return "greetings, " + p.getName() + "!";
	}

}
