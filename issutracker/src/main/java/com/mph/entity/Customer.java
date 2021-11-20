package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cust_id;
	@Column
	private String cust_name;
	@Column
	private String cust_email;
	@Column
	private String cust_address;
	@Column
	private String cust_password;
	@Column
	private int cust_mobile;
	@Column
	private String cust_gender;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	public Customer(int cust_id, String cust_name, String cust_email, String cust_address, String cust_password,
			int cust_mobile, String cust_gender) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_email = cust_email;
		this.cust_address = cust_address;
		this.cust_password = cust_password;
		this.cust_mobile = cust_mobile;
		this.cust_gender = cust_gender;
	}





	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public int getCust_mobile() {
		return cust_mobile;
	}

	public void setCust_mobile(int cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	
	

	public String getCust_gender() {
		return cust_gender;
	}



	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}



	public String getCust_email() {
		return cust_email;
	}



	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	


	public String getCust_password() {
		return cust_password;
	}





	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}





	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_email=" + cust_email
				+ ", cust_address=" + cust_address + ", cust_password=" + cust_password + ", cust_mobile=" + cust_mobile
				+ ", cust_gender=" + cust_gender + "]";
	}


	


	



	
	
	
	

}
