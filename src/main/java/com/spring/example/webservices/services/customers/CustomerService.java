package com.spring.example.webservices.services.customers;

import com.spring.example.webservices.entity.Customer;

public interface CustomerService {
	public Customer getCustomerById(String customerId);
}
