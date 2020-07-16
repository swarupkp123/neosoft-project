package com.task.java.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.task.java.model.UserModel;
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
	
	
	@GetMapping("/userById/{id}")
	public String findByid(@PathVariable int id) {
		UserModel dAOUser=userService.getProductById(id);
		System.out.println("user id"+dAOUser.getId());
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr=null;
		try {
			jsonStr = Obj.writeValueAsString(dAOUser);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hinmsfafafaf"+jsonStr);
		
		return jsonStr;
		
	}
	
	
	
	@GetMapping("/userByName/{username}")
	public String findUsername(@PathVariable String username) {
		UserModel dAOUser=userService.getUserByUsername(username);
		System.out.println("user id"+dAOUser.getUsername());
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr=null;
		try {
			jsonStr = Obj.writeValueAsString(dAOUser);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hinmsfafafaf"+jsonStr);
		return jsonStr;
	}
	
	
	
	
	
	
	

}