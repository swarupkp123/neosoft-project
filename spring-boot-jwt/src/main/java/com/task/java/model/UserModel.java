package com.task.java.model;




import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "user_master")
public class UserModel{

	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	/*
	 * @Column private String roleid;
	 */
	
	@Column
	private int roleid;
	
	@Column
	private String createdDate;
	
	@Column
	private String updatedDate;
	
	@Column
	private String active;
	
	@Column
	private String last_login;
	
	//@OneToMany(targetEntity=UserContactModel.class,cascade=CascadeType.ALL)
	//@JoinColumn(name="ucd_id", referencedColumnName="uc_id")
	//@OneToMany(mappedBy="userModel")
	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY,cascade =  CascadeType.ALL,mappedBy="userModel")
	private Set<UserContactModel> userContactModel;
	
	/*
	 * @OneToOne(fetch =
	 * FetchType.LAZY,targetEntity=UserDetailsModel.class,cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="umn_id",referencedColumnName="ud_id") private
	 * UserDetailsModel userDetailsModel;
	 */
	
	@JsonManagedReference//resolve the error of StackOverflowError
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL,mappedBy = "userModel")
    private UserDetailsModel userDetailsModel;

	public UserModel() {
	}

	/*
	 * public UserModel(int id, String username, String password, int roleid, String
	 * createdDate, String updatedDate, String active, String last_login) { this.id
	 * = id; this.username = username; this.password = password; this.roleid =
	 * roleid; this.createdDate = createdDate; this.updatedDate = updatedDate;
	 * this.active = active; this.last_login = last_login; }
	 */
	
	
	

	

	public UserModel(String username, String password, int roleid, String createdDate, String updatedDate,
			String active, String last_login, Set<UserContactModel> userContactModel,
			UserDetailsModel userDetailsModel) {
		//this.id = id;
		this.username = username;
		this.password = password;
		this.roleid = roleid;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.active = active;
		this.last_login = last_login;
		this.userContactModel = userContactModel;
		this.userDetailsModel = userDetailsModel;
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

	public Set<UserContactModel> getUserContactModel() {
		return userContactModel;
	}

	public void setUserContactModel(Set<UserContactModel> userContactModel) {
		this.userContactModel = userContactModel;
	}

	public UserDetailsModel getUserDetailsModel() {
		return userDetailsModel;
	}

	public void setUserDetailsModel(UserDetailsModel userDetailsModel) {
		this.userDetailsModel = userDetailsModel;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", password=" + password + ", roleid=" + roleid
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", active=" + active
				+ ", last_login=" + last_login + ", userContactModel=" + userContactModel + ", userDetailsModel="
				+ userDetailsModel + "]";
	}

}