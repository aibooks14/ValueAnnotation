package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.config.Config;
import com.example.demo.service.ValueService;

@Controller
public class ValueController {

//	@Autowired
	ValueService valueService = new ValueService();

	Config config = new Config();

	public ValueController(ValueService valueService, Config config) {
		super();
		this.valueService = valueService;
		this.config = config;
	}

	@GetMapping("/")
	public String takeValues() {
		valueService.testMethod();
		System.out.println("------------------------");
		return "index";
	}

	@GetMapping("/test")
	public String configTestMethod() {
		config.testMethod() ;
		
		return "index" ;

	}

}
