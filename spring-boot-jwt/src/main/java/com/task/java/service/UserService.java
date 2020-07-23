package com.task.java.service;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.task.java.dao.UserContactDao;
import com.task.java.dao.UserDao;
import com.task.java.dao.UserDetailsDao;
import com.task.java.model.UserContactModel;
import com.task.java.model.UserDetailsModel;
import com.task.java.model.UserModel;
import com.task.java.pojo.UserContactPojo;
import com.task.java.pojo.UserDetailsPojo;
import com.task.java.pojo.UserPojo;


@Service
public class UserService {

	private static final Logger logger = LogManager.getLogger(UserService.class);
	 
	
	
	//@Qualifier("userDao")
	@Autowired
	private UserDao userDao;
	
	
	@Autowired
	private UserDetailsDao userDetailsDao;
	
	
	@Autowired
	private UserContactDao userContactDao;
	
	

    //@Qualifier("bcryptEncoder")
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	
	  public UserModel saveUser(UserPojo user){ 
	   String address = null;
	   String pincode = null;
	  UserModel savetodb=null;
	  String city = null;
	  String state = null;
	  String country = null;
	  String type = null;
	  String created_date = null;
	  String updated_date = null;
	  String status = null;
	  Set<UserContactModel> userContactModels = null;
	  userContactModels = new HashSet<UserContactModel>();
	  UserContactModel userContactModel=null;
	  userContactModel = new UserContactModel();
	  Set<UserContactPojo> userContactPojos = null; 
	  userContactPojos = new HashSet<UserContactPojo>();
	  try {
	  logger.info("$$$$$ saveUser of UserService class $$$$$"); 
	  UserModel userModel=new UserModel();
	  userModel.setUsername(user.getUsername());
	  userModel.setPassword(bcryptEncoder.encode(user.getPassword()));
	  userModel.setRoleid(user.getRoleid()); 
	  userModel.setCreatedDate(user.getCreatedDate());
	  userModel.setUpdatedDate(user.getUpdatedDate());
	  userModel.setActive(user.getActive());
	  userModel.setLast_login(user.getLast_login()); 
	  System.out.println("hi");
	  UserDetailsModel userDetailsModel=new UserDetailsModel();
	  userDetailsModel.setName(user.getUserDetailsPojo().getName());
	  userDetailsModel.setSurname(user.getUserDetailsPojo().getSurname());
	  userDetailsModel.setDob(user.getUserDetailsPojo().getDob());
	  userDetailsModel.setGender(user.getUserDetailsPojo().getGender());
	  userDetailsModel.setCreated_date(user.getUserDetailsPojo().getCreated_date());
	  userDetailsModel.setUpdated_date(user.getUserDetailsPojo().getUpdated_date());
	  userDetailsModel.setStatus(user.getUserDetailsPojo().getStatus());
	  userModel.setUserDetailsModel(userDetailsModel);
	  userDetailsModel.setUserModel(userModel);
	  System.out.println(userModel.getUsername());
	  try{
		         //userContactPojos = user.getUserContactPojos();
		         System.out.println("bbbbbbbbbbbbbbbbb"+user.getUserContactPojos());
		    	 for(UserContactPojo userContactPojo:user.getUserContactPojos()) {
		          //int uc_id = userContactPojo.getUc_id();
		          address = userContactPojo.getAddress();
		          pincode = userContactPojo.getPincode();
		          city = userContactPojo.getCity();
		          state = userContactPojo.getState();
		          country = userContactPojo.getCountry();
		          type = userContactPojo.getType();
		          created_date = userContactPojo.getCreated_date();
		          updated_date = userContactPojo.getUpdated_date();
		          status = userContactPojo.getStatus();
		          userContactModel = new UserContactModel(address,pincode,city,state,country,type,created_date,updated_date,status);
		          userContactModel.setUserModel(userModel);
		          //userModel.setUserContactModel(userContactModels);
		          //userModel.getUserContactModel().add(userContactModel);
		         
		          userContactModels.add(userContactModel);
		          //userModel.setUserContactModel(userContactModels);
		          
		     }
		 }catch(Exception e){e.printStackTrace();}
	  userModel.setUserContactModel(userContactModels);
	  //userModel.setUserContactModel(userContactModels);
	  
		/*
		 * for(UserContactPojo userContactPojo:user.getUserContactPojo()) {
		 * UserContactModel userContactModel = new UserContactModel();
		 * userContactModel.setAddress(userContactPojo.getAddress());
		 * 
		 * }
		 */
	  //UserContactModel userContactModels=new UserContactModel();
	   //userContactModels.setAddress(user.getUserContactPojo().);
	  savetodb=userDao.save(userModel);
	  //savetodb=userDao.save(userDetailsModel);
	  } catch(Exception e) {
	  logger.error("$$$$$ (Exception) ERROR in ~saveUser~ UserService $$$$$" + e);
	  } 
	  return savetodb; 
	  }
	 
	
	
	
	/*
	 * public UserModel saveUser(UserPojo user){ UserModel savetodb=null; try {
	 * logger.info("$$$$$ saveUser of UserService class $$$$$"); UserModel
	 * userModel=new UserModel(); userModel.setUsername(user.getUsername());
	 * userModel.setPassword(bcryptEncoder.encode(user.getPassword()));
	 * userModel.setRoleid(user.getRoleid());
	 * userModel.setCreatedDate(user.getCreatedDate());
	 * userModel.setUpdatedDate(user.getUpdatedDate());
	 * userModel.setActive(user.getActive());
	 * userModel.setLast_login(user.getLast_login());
	 * savetodb=userDao.save(userModel); } catch(Exception e) {
	 * logger.error("$$$$$ (Exception) ERROR in ~saveUser~ UserService $$$$$" + e);
	 * } return savetodb; }
	 */
	
	
	     //to find the detail bu using id
		/*
		 * public UserModel getUserById(int id){
		 * System.out.println("nnnnnnnnnnnnnnnnnnnnnnn"+userDao.findById(id).orElse(null
		 * )); return userDao.findById(id).orElse(null); }
		 */

	
	    public UserModel getUserByUsername(String name) { 
		  // TODO Auto-generated method stub 
		  return userDao.findByUsername(name); 
		  }
	  
	  
			/*
			 * public UserDetailsModel getUserByName(String name) { // TODO Auto-generated
			 * method stub return userDetailsDao.findByName(name); }
			 */
	  
	  public List<UserDetailsModel> getUserByName(String name) { 
		  // TODO Auto-generated method stub 
		  
		  return userDetailsDao.findByName(name);
		  }
	 


	public UserModel updateRoleid(UserPojo user) {
		// TODO Auto-generated method stub
		UserModel existingUser=userDao.findById(user.getId()).orElse(null);
		existingUser.setRoleid(user.getRoleid());
		return userDao.save(existingUser);
	}




	
	 
	 
	
	
	public List<UserModel> getUserByFindDetails(String address, String city, String pincode) {
		// TODO Auto-generated method stub
		return userDao.findByDetails(address, city, pincode);
	}
	
	
	 public List<UserContactModel> getUserByContactDetails(String address, String city, String pincode) { 
		  // TODO Auto-generated method stub 
		  return userContactDao.contactByDetails(address, city, pincode); 
		  }

}
