package com.task.java.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.java.model.UserModel;

@Repository
public interface UserDao extends JpaRepository<UserModel, Integer> {
	
	UserModel findByUsername(String username);

	

	
	
}