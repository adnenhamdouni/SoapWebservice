package com.spring.example.webservices.services.customers;

import com.spring.example.webservices.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	public Customer getCustomerById(String customerId) {
		Customer customer = new Customer();
		customer.setId(123);
		customer.setName("Adnen");
		return customer;
	}
}
