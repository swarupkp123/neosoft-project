package com.task.java.pojo;

import javax.persistence.Column;

public class UserDetailsPojo {
    
	private int ud_id;
	private String name;
	private String surname;
	private String dob;
	private String gender;
	private String created_date;
	private String updated_date;
	private String status;
	
	
	
	
	
	
	public UserDetailsPojo(String name, String surname, String dob, String gender, String created_date,
			String updated_date, String status) {
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.gender = gender;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.status = status;
	}
	public int getUd_id() {
		return ud_id;
	}
	public void setUd_id(int ud_id) {
		this.ud_id = ud_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	
	
	
}
