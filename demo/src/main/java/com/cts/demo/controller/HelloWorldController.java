package com.cts.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	
	@GetMapping(value = "/hello")
	public String getHelloMessage()
	{
		
		return "Hello";
	}
	
	
	@GetMapping(value = "/")
	public String getIndex()
	{
		
		return "WelCome To Spring Boot";
	}
	

	
	
	
	

}
