package com.task.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.task.java.model.UserDetailsModel;
import com.task.java.model.UserModel;

@Repository
public interface UserDetailsDao extends JpaRepository<UserDetailsModel, Integer> {
	//@Query(value = "SELECT * FROM user_master c INNER JOIN user_details_tbl d ON d.user_id = c.id WHERE d.name = :name", nativeQuery = true)
	//UserDetailsModel findByName(String name);
	
	@Query(value = "SELECT * FROM user_master c INNER JOIN user_details_tbl d ON d.user_id = c.id WHERE d.name = :name", nativeQuery = true)
	List<UserDetailsModel> findByName(String name);
}
