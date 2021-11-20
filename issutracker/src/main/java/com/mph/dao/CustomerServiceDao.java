package com.mph.dao;

import java.util.List;

import com.mph.entity.Customer;
import com.mph.entity.CustomerServiceE;

public interface CustomerServiceDao {
	
	List<CustomerServiceE> getCustomerServiceEList();
	
	void createCustomerServiceE(CustomerServiceE customerServiceE);
	

	List<CustomerServiceE> deleteCustomerServiceE(int ser_id);
	

}
