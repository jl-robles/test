package com.example.demo.dao;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public Customer getData() {
		
		Customer custom = new Customer();
		
		custom.setName("JLuis Robles Matias");
		custom.setAge(33);
		custom.setAccount(123456789);

		return custom;
	}

	@Override
	public Date getTime() {
		System.out.println(" -- Current time: ");
		return new Date();
	}

}
