package com.mph.service;

import java.util.List;

import com.mph.entity.CustomerServiceE;

public interface CustomerServService {

List<CustomerServiceE> getCustomerServiceEList();
	
	void createCustomerServiceE(CustomerServiceE customerServiceE);
	

	List<CustomerServiceE> deleteCustomerServiceE(int ser_id);
}
