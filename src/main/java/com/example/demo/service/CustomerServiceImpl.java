package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customer;
	
	@Override
	public CustomerDao getData() {
		System.out.println("  Inside Service");
		customer.getData();
		
		return customer;
	}

}
