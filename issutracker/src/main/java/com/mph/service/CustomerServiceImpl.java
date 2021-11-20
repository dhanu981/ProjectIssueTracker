package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.CustomerDao;
import com.mph.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public List<Customer> getCustomerList() {
		return customerDao.getCustomerList();
	}

	@Override
	public Customer getCustomer(Customer customer) {
		return customerDao.getCustomer(customer);
	}

	@Override
	public void createCustomer(Customer customer) {
		customerDao.createCustomer(customer);
		
	}

	@Override
	public List<Customer> updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	@Override
	public List<Customer> deleteCustomer(int cust_id) {
		return customerDao.deleteCustomer(cust_id);
	}

	@Override
	public Customer getCustomerById(int cust_id) {
		return customerDao.getCustomerById(cust_id);
	}

	@Override
	public List<Customer> searchCustomerById(int cust_id) {
		return customerDao.searchCustomerById(cust_id);
	}

	
}
