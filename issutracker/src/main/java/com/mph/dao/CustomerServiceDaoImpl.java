package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Customer;
import com.mph.entity.CustomerServiceE;

@Repository
public class CustomerServiceDaoImpl implements CustomerServiceDao{

	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}


	@Override
	public List<CustomerServiceE> getCustomerServiceEList() {
		Query qry = getSession().createQuery("from CustomerServiceE");
		List<CustomerServiceE> cselist = qry.list();
		return cselist;
	}



	@Override
	public void createCustomerServiceE(CustomerServiceE customerServiceE) {
		getSession().saveOrUpdate(customerServiceE);
		System.out.println("CustomerService Stored Successfully :)");
		
	}

	@Override
	public List<CustomerServiceE> deleteCustomerServiceE(int ser_id) {
		Query qry = getSession().createQuery("delete CustomerServiceE where ser_id=:eno");		
		qry.setParameter("eno", ser_id);		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " +  ser_id + "successfully !!!");
		}
		return getCustomerServiceEList();
	}

	
}
