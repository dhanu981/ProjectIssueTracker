package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.CustomerDao;
import com.mph.dao.CustomerServiceDao;
import com.mph.entity.CustomerServiceE;

@Service
@Transactional
public class CustomerServServiceImpl implements CustomerServService{

	@Autowired
	CustomerServiceDao customerServiceDao;
	
	@Override
	public List<CustomerServiceE> getCustomerServiceEList() {
		// TODO Auto-generated method stub
		return customerServiceDao.getCustomerServiceEList();
	}

	@Override
	public void createCustomerServiceE(CustomerServiceE customerServiceE) {
		customerServiceDao.createCustomerServiceE(customerServiceE);
		
	}


	@Override
	public List<CustomerServiceE> deleteCustomerServiceE(int ser_id) {
		
		return customerServiceDao.deleteCustomerServiceE(ser_id);
	}

}
