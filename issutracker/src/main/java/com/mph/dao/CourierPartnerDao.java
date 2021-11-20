package com.mph.dao;

import java.util.List;

import com.mph.entity.CourierPartner;

public interface CourierPartnerDao {

	public List<CourierPartner> getCourierPartnerList();
	public CourierPartner getCourierPartner(CourierPartner courierpartner);
	public void createCourierPartner(CourierPartner courierpartner);
	public List<CourierPartner>updateCourierPartner(CourierPartner courierpartner);
	public List<CourierPartner>deleteCourierPartner(int cp_id);
	
	public CourierPartner getCourierPartnerById(int cp_id);
	public List<CourierPartner> searchCourierPartnerById(int cp_id);

}
