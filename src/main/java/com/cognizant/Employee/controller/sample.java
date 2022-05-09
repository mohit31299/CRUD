package com.cognizant.Employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@GetMapping("/api/")
public class sample {

	@GetMapping("/test")
	public String sample() {
		return "Working Fine";
	}
	
}
