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


@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}


	@Override
	public List<Customer> getCustomerList() {
		Query qry = getSession().createQuery("from Customer");
		List<Customer> custlist = qry.list();
		return custlist;
	}


	@Override
	public Customer getCustomer(Customer customer) {
		Criteria c = getSession().createCriteria(Customer.class);
		c.add(Restrictions.eq("email", customer.getCust_email()));
		Customer cust = (Customer)c.uniqueResult();
		
		return cust;
	}


	@Override
	public void createCustomer(Customer customer) {
		getSession().saveOrUpdate(customer);
		System.out.println("Customer Stored Successfully :)");
		
		
	}


	@Override
	public List<Customer> updateCustomer(Customer customer) {
		Query qry = getSession().createQuery("update Customer set cust_name=:nam,cust_password=:pass where cust_id=:eno");
		qry.setParameter("nam", customer.getCust_name());
		qry.setParameter("pass", customer.getCust_password());
		qry.setParameter("eno", customer.getCust_id());
		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Update is successfull !!!");
		}
		return getCustomerList();
	}


	@Override
	public List<Customer> deleteCustomer(int cust_id) {
		Query qry = getSession().createQuery("delete Customer where cust_id=:eno");		
		qry.setParameter("eno", cust_id);		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " +  cust_id + "successfully !!!");
		}
		return getCustomerList();
	}


	@Override
	public Customer getCustomerById(int cust_id) {
		Query query = getSession().createQuery("from Customer cust where cust_id=:eno");
		query.setParameter("eno", cust_id);
		Customer custlist = (Customer)query.uniqueResult();
		System.out.println(custlist);
		return custlist; 
	}


	@Override
	public List<Customer> searchCustomerById(int cust_id) {
		Query query = getSession().createQuery("from Customer cust where cust_id=:eno");
		query.setParameter("eno", cust_id);
		List<Customer> custlist =query.list();
		System.out.println(custlist);
		return custlist; 
	}
}
