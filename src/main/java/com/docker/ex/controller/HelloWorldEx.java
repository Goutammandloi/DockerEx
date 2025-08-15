package com.docker.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldEx {

	
	@GetMapping("/message")
	public String message() {
		return "hello Master ";
	}
}
