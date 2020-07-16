package com.task.java.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details_tbl")
public class UserDetailsModel {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ud_id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private String dob;
	
	@Column
	private String gender;
	
	@Column
	private String created_date;
	
	@Column
	private String updated_date;
	
	@Column
	private String status;
	
	
	  @OneToOne(targetEntity=UserModel.class,cascade=CascadeType.ALL)
	  @JoinColumn(name="u_id",referencedColumnName="id") 
	  private UserModel userModel;
	 

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

	

	
	  @Override public String toString() { return "UserDetailsModel [ud_id=" +
	  ud_id + ", name=" + name + ", surname=" + surname + ", dob=" + dob +
	  ", gender=" + gender + ", created_date=" + created_date + ", updated_date=" +
	  updated_date + ", status=" + status + ", userModel=" + userModel + "]"; }
	 
	
	
	
	
	
	
}
