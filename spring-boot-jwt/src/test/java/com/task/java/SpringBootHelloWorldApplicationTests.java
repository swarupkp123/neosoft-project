package com.task.java;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.junit5.SpringRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.task.java.dao.UserContactDao;
import com.task.java.dao.UserDao;
import com.task.java.dao.UserDetailsDao;
import com.task.java.model.UserContactModel;
import com.task.java.model.UserDetailsModel;
import com.task.java.model.UserModel;
import com.task.java.pojo.UserContactPojo;
import com.task.java.pojo.UserDetailsPojo;
import com.task.java.pojo.UserPojo;
import com.task.java.service.UserService;

//@RunWith(SpringRunner.class)
/*@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringBootHelloWorldApplicationTests {

	@Test
	public void contextLoads() {
	}
}
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHelloWorldApplicationTests {

	@Autowired
	private UserService service;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@MockBean
	private UserDao repository;
	
	@MockBean
	private UserDetailsDao userDetailsDao;
	
	@MockBean
	private UserContactDao userContactDao;
	
	
	
	
	  @Test public void getUserByNameTest() { //when
	  when(userDetailsDao.findByName("rameshkumar")).thenReturn(Stream.of(new UserDetailsModel("rameshkumar", "swain", "19-08-2016", "MALE","15-07-2020", "15-07-2020", "active")).collect(Collectors.toList()));
	  //pass the id
	  //when(userDetailsDao.findByName("rameshkumar")).thenReturn(new UserDetailsModel(4, "rameshkumar", "swain", "19-08-2016", "MALE","15-07-2020", "15-07-2020", "active"));
	  assertEquals(1, service.getUserByName("rameshkumar").size());
	  
	  //then
	  
	  //given 
	  }
	 
	
	
	
	@Test
	public void getUserByContactDetailsTest() {
		//when
		when(userContactDao.contactByDetails("temporary", "pune", "789654")).thenReturn(Stream.of(new UserContactModel("temporary", "789654", "pune", "maharastra", "india", "temp", "15-07-2020", "15-07-2020", "active")).collect(Collectors.toList()));
		//when(userDetailsDao.findByName("rameshkumar")).thenReturn(new UserDetailsModel(4, "rameshkumar", "swain", "19-08-2016", "MALE", "15-07-2020", "15-07-2020", "active"));
		assertEquals(1, service.getUserByContactDetails("temporary", "pune", "789654").size());
		
		//then
		
		//given
	}
	
	
	
	@Test
	public void saveUserTest() {
		//when
		String password=bcryptEncoder.encode("pwd1");
		
		UserContactModel userContactModel1=new UserContactModel("temporary", "789654", "pune", "maharastra", "india", "temp", "19-2-2012", "19-2-2012", "active");
		UserContactModel userContactModel2=new UserContactModel("permanent", "963258", "berhampur", "odisha", "india", "perm", "19-2-2010", "19-2-2012", "not active");
		Set<UserContactModel> userContactModels=new HashSet<UserContactModel>();
		userContactModels.add(userContactModel1);
		userContactModels.add(userContactModel2);
		
		UserContactPojo userContactPojo1=new UserContactPojo("temporary", "789654", "pune", "maharastra", "india", "temp", "19-2-2012", "19-2-2012", "active");
		UserContactPojo userContactPojo2=new UserContactPojo("permanent", "963258", "berhampur", "odisha", "india", "perm", "19-2-2010", "19-2-2012", "not active");
		Set<UserContactPojo> userContactPojos=new HashSet<UserContactPojo>();
		userContactPojos.add(userContactPojo1);
		userContactPojos.add(userContactPojo2);
		
		UserDetailsModel userDetailsModel=new UserDetailsModel("rameshkumar", "swain", "19-08-2016", "MALE", "19-7-1980", "19-7-2013", "active");
		
		UserDetailsPojo userDetailsPojo=new UserDetailsPojo("rameshkumar", "swain", "19-08-2016", "MALE", "19-7-1980", "19-7-2013", "active");
		
		UserModel user = new UserModel("ramesh", "password", 109, "15-07-2020", "15-07-2020", "true", "15-07-2020 06:08 AM", userContactModels, userDetailsModel);
		
		//
		UserPojo user1 = new UserPojo("ramesh", "password", 109, "15-07-2020", "15-07-2020", "true", "15-07-2020 06:08 AM", userDetailsPojo, userContactPojos);
		when(repository.save(user)).thenReturn(user);
		//when(userDetailsDao.findByName("rameshkumar")).thenReturn(new UserDetailsModel(4, "rameshkumar", "swain", "19-08-2016", "MALE", "15-07-2020", "15-07-2020", "active"));
		assertEquals(user, service.saveUser(user1));
		
		//then
		
		//given
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
