package com.example.demo.service;

import java.util.Date;

import com.example.demo.dao.CustomerDao;

public interface CustomerService {
	
	CustomerDao getData();
	Date getTime();

}
