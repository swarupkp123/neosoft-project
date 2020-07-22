package com.task.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.task.java.model.UserContactModel;
import com.task.java.model.UserDetailsModel;
import com.task.java.model.UserModel;
import com.task.java.pojo.UserPojo;
import com.task.java.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping({ "/hello" })
	public String firstPage() {
		System.out.println("hi");
		return "Hello World";
	}

	/*
	 * @GetMapping("/userById/{id}") public DAOUser findByid(@PathVariable int id) {
	 * DAOUser dAOUser=userService.getProductById(id);
	 * System.out.println("hinm"+dAOUser.getEmail()); return dAOUser;
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/userById/{id}") public String findByid(@PathVariable int id) {
	 * UserModel dAOUser = userService.getUserById(id); System.out.println("user id"
	 * + dAOUser.getId()); ObjectMapper Obj = new ObjectMapper(); String jsonStr =
	 * null; try { jsonStr = Obj.writeValueAsString(dAOUser); } catch
	 * (JsonProcessingException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } System.out.println("hinmsfafafaf" + jsonStr);
	 * 
	 * return jsonStr;
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/userByName/{name}") public String findUsername(@PathVariable
	 * String name) { UserDetailsModel dAOUser=userService.getUserByUsername(name);
	 * System.out.println("user id"+dAOUser.getUserModel().getUsername());
	 * ObjectMapper Obj = new ObjectMapper(); String jsonStr=null; try { jsonStr =
	 * Obj.writeValueAsString(dAOUser); } catch (JsonProcessingException e) { //TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * System.out.println("hinmsfafafaf"+jsonStr); return jsonStr; }
	 */

	@GetMapping("/userByName/{username}")
	public String findUsername(@PathVariable String username) {
		UserModel dAOUser = userService.getUserByUsername(username);
		System.out.println("user id" + dAOUser.getUsername());
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr = null;
		try {
			jsonStr = Obj.writeValueAsString(dAOUser);
		} catch (JsonProcessingException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonStr;
	}

	/*
	 * @GetMapping("/userName/{name}") public UserDetailsModel
	 * findName(@PathVariable String name) { UserDetailsModel
	 * dAOUser=userService.getUserByName(name);
	 * 
	 * System.out.println("user id"+dAOUser.getName()); ObjectMapper Obj = new
	 * ObjectMapper(); String jsonStr=null; try { jsonStr =
	 * Obj.writeValueAsString(dAOUser); } catch (JsonProcessingException e) { //TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * //return "ramesh kumar"; return dAOUser; }
	 */

	@GetMapping("/userName/{name}")
	public String findName(@PathVariable String name) {
		List<UserDetailsModel> dAOUsers = userService.getUserByName(name);
		
		  System.out.println("user id"+dAOUsers.get(0).getName());
		  ObjectMapper Obj = new ObjectMapper(); 
		  String jsonStr=null; 
		  try { 
			  jsonStr = Obj.writeValueAsString(dAOUsers); 
			  } 
		  catch (JsonProcessingException e) { 
			  //TODO Auto-generated catch block 
			  e.printStackTrace(); 
			  }
		//return "ramesh kumar";
		return jsonStr;
	}

	/*
	 * @GetMapping("/userByName/{username}") public String
	 * findUsername(@PathVariable String username) {
	 * userService.getUserByUsername(username);
	 * //System.out.println("user id"+dAOUser.getUsername());
	 * 
	 * ObjectMapper Obj = new ObjectMapper(); String jsonStr=null; try { jsonStr =
	 * Obj.writeValueAsString(dAOUser); } catch (JsonProcessingException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); }
	 * System.out.println("hinmsfafafaf"+jsonStr);
	 * 
	 * return null; }
	 */
	
	
	
	
	@GetMapping("/{address}/{city}/{pincode}")
	public String findDetails(@PathVariable String address, @PathVariable String city, @PathVariable String pincode) {
		List<UserModel> dAOUsersDetails = userService.getUserByFindDetails(address,city,pincode);
		
		  //System.out.println("user id"+dAOUsersDetails.get(0).getCountry());
		  ObjectMapper Obj = new ObjectMapper(); 
		  String jsonStr=null; 
		  try { 
			  jsonStr = Obj.writeValueAsString(dAOUsersDetails); 
			  } 
		  catch (JsonProcessingException e) { 
			  //TODO Auto-generated catch block 
			  e.printStackTrace(); 
			  }
		//return "ramesh kumar";
		return jsonStr;
	}
	
	
	@GetMapping("/onlyContactInformation/{address}/{city}/{pincode}")
	public String contactDetails(@PathVariable String address, @PathVariable String city, @PathVariable String pincode) {
		List<UserContactModel> dAOUsersDetails = userService.getUserByContactDetails(address,city,pincode);
		
		  //System.out.println("user id"+dAOUsersDetails.get(0).getCountry());
		  ObjectMapper Obj = new ObjectMapper(); 
		  String jsonStr=null; 
		  try { 
			  jsonStr = Obj.writeValueAsString(dAOUsersDetails); 
			  } 
		  catch (JsonProcessingException e) { 
			  //TODO Auto-generated catch block 
			  e.printStackTrace(); 
			  }
		//return "ramesh kumar";
		return jsonStr;
	}

	@RequestMapping(value = "/updateRoleid", method = RequestMethod.PUT)
	public ResponseEntity<String> updatePolicyEmail(@RequestBody UserPojo user) {
		UserModel custPolicy = userService.updateRoleid(user);
		return new ResponseEntity<>("Roleid updated successfully", HttpStatus.OK);
	}

}