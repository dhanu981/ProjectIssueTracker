package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CourierPartner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cp_id;
	private String cp_name;
	private int cp_mobile;
	
	public CourierPartner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public CourierPartner(String cp_name, int cp_mobile, int cp_id) {
		super();
		this.cp_name = cp_name;
		this.cp_mobile = cp_mobile;
		this.cp_id = cp_id;
	}




	public String getCp_name() {
		return cp_name;
	}
	public void setCp_name(String cp_name) {
		this.cp_name = cp_name;
	}
	public int getCp_mobile() {
		return cp_mobile;
	}
	public void setCp_mobile(int cp_mobile) {
		this.cp_mobile = cp_mobile;
	}
	public int getCp_id() {
		return cp_id;
	}
	public void setCp_id(int cp_id) {
		this.cp_id = cp_id;
	}
	@Override
	public String toString() {
		return "CourierPartner [cp_name=" + cp_name + ", cp_mobile=" + cp_mobile + ", cp_id=" + cp_id + "]";
	}
	

	
}
