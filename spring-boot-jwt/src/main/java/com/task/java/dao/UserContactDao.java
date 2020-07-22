package com.task.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.task.java.model.UserContactModel;
import com.task.java.model.UserDetailsModel;
import com.task.java.model.UserModel;

public interface UserContactDao extends JpaRepository<UserContactModel, Integer> {

	@Query(value = "SELECT * FROM user_master c INNER JOIN user_contact_tbl d ON d.um_id = c.id WHERE d.address = :address && d.city = :city && d.pincode = :pincode", nativeQuery = true)
	List<UserContactModel> contactByDetails(String address, String city, String pincode);
	
	
	
}
