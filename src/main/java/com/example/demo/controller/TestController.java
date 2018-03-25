package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerDao;
import com.example.demo.service.CustomerService;

@RestController
public class TestController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/data")
	@ResponseBody
	public CustomerDao getData() {
		System.out.println(" -- Inside Controller - data **");
		
		return service.getData();
	}
	
	@GetMapping("/access")
	@ResponseBody
	public String getInfo() {
		System.out.println(" -- Inside Controller - access **");
		
		return "access";
	}

}
