package com.task.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.task.java.model.UserContactModel;
import com.task.java.model.UserDetailsModel;
import com.task.java.model.UserModel;

@Repository
public interface UserDao extends JpaRepository<UserModel, Integer> {
	
	UserModel findByUsername(String name);

	UserDetailsModel save(UserDetailsModel userDetailsModel);

	/*
	 * int savetoDb(UserModel userModel);
	 */
	
	/*
	 * @Query(value = "SELECT * FROM UserModel WHERE username = :username",
	 * nativeQuery = true) UserDetailsModel findByUsername(@Param("username") String
	 * username);
	 */
	
	@Query(value = "SELECT * FROM user_master c INNER JOIN user_contact_tbl d ON d.um_id = c.id WHERE d.address = :address && d.city = :city && d.pincode = :pincode", nativeQuery = true)
	List<UserModel> findByDetails(String address, String city, String pincode);
	
	
}