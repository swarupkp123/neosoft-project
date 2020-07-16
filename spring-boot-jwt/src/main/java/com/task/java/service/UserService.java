package com.task.java.service;



import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.task.java.dao.UserDao;
import com.task.java.model.UserModel;
import com.task.java.pojo.UserPojo;


@Service
public class UserService {

	private static final Logger logger = LogManager.getLogger(UserService.class);
	
	@Autowired
	private UserDao userDao;
	
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	
	public UserModel saveUser(UserPojo user){
		UserModel savetodb=null;
		try {
		logger.info("$$$$$ saveUser of UserService class $$$$$");
		UserModel newUser = new UserModel();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setRoleid(user.getRoleid());
		newUser.setCreatedDate(user.getCreatedDate());
		newUser.setUpdatedDate(user.getUpdatedDate());
		newUser.setActive(user.getActive());
		newUser.setLast_login(user.getLast_login());
		
		savetodb=userDao.save(newUser);
		}
		catch(Exception e) {
			logger.error("$$$$$ (Exception) ERROR in ~saveUser~ UserService $$$$$" + e);
		}
		return savetodb;
	}
	
	//to find the detail bu using id
	public UserModel getProductById(int id){
	return userDao.findById(id).orElse(null);
	}

	public UserModel getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.findByUsername(username);
	}

	

	
	
	

}
