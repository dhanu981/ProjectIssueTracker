package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.CourierPartner;

@Repository
public class CourierPartnerDaoImpl implements CourierPartnerDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}


	@Override
	public List<CourierPartner> getCourierPartnerList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CourierPartner getCourierPartner(CourierPartner courierpartner) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void createCourierPartner(CourierPartner courierpartner) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<CourierPartner> updateCourierPartner(CourierPartner courierpartner) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<CourierPartner> deleteCourierPartner(int cp_id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CourierPartner getCourierPartnerById(int cp_id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<CourierPartner> searchCourierPartnerById(int cp_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
