package com.spring.example.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.spring.example.webservices.entity.Customer;
import com.spring.example.webservices.services.customers.CustomerService;

@WebService(serviceName = "customerService")
public class CustomerEndpoint {
	private CustomerService service;

	@WebMethod(exclude = true)
	public void setService(CustomerService service) {
		this.service = service;
	}

	@WebMethod(operationName = "getCustomer")
	public Customer getCustomerById(String customerId) {
		Customer customer = service.getCustomerById(customerId);
		return customer;
	}

}
