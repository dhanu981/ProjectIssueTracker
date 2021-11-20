package com.mph.service;

import java.util.List;

import com.mph.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomerList();
	public Customer getCustomer(Customer customer);
	public void createCustomer(Customer customer);
	public List<Customer>updateCustomer(Customer customer);
	public List<Customer>deleteCustomer(int cust_id);
	
	public Customer getCustomerById(int cust_id);
	public List<Customer> searchCustomerById(int cust_id);
}
