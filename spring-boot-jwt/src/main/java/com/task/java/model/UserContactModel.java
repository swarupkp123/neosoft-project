package com.task.java.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "user_contact_tbl")
public class UserContactModel {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uc_id;
	
	@Column
	private String address;
	
	@Column
	private String pincode;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String country;
	
	@Column
	private String type;
	
	@Column
	private String created_date;
	
	@Column
	private String updated_date;
	
	@Column
	private String status;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="um_id", nullable=false)
    private UserModel userModel; 
	
	
	
	 

	public UserContactModel() {
	}

	public UserContactModel(String address, String pincode, String city, String state, String country,
			String type, String created_date, String updated_date, String status) {
		
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.type = type;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.status = status;
	}

	public int getUc_id() {
		return uc_id;
	}

	public void setUc_id(int uc_id) {
		this.uc_id = uc_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	
	
	
	
}
