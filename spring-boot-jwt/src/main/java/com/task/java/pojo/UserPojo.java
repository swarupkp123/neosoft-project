package com.task.java.pojo;

import java.io.Serializable;
import java.util.Set;

import com.task.java.model.UserContactModel;



public class UserPojo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private String password;
	//private String roleid;
	private int roleid;
	private String createdDate;
	private String updatedDate;
	private String active;
	private String last_login;
	
	
	private UserDetailsPojo userDetailsPojo;
	
	private Set<UserContactPojo> userContactPojos;
	
	

	public UserPojo(int id, String username, String password, int roleid, String createdDate, String updatedDate,
			String active, String last_login) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.roleid = roleid;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.active = active;
		this.last_login = last_login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	public UserDetailsPojo getUserDetailsPojo() {
		return userDetailsPojo;
	}

	public void setUserDetailsPojo(UserDetailsPojo userDetailsPojo) {
		this.userDetailsPojo = userDetailsPojo;
	}

	public Set<UserContactPojo> getUserContactPojos() {
		return userContactPojos;
	}

	public void setUserContactPojos(Set<UserContactPojo> userContactPojos) {
		this.userContactPojos = userContactPojos;
	}

	

	
	

	
	
	
	
	
}