package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

	@GetMapping("/home")
	public String home() {
		return "Hello Spring boot from spring project";
	}
}
