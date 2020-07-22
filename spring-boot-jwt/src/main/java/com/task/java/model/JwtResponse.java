package com.task.java.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JwtResponse implements Serializable {

	//private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private String time;
	
	   

	

	public JwtResponse(String jwttoken, String time) {
		super();
		this.jwttoken = jwttoken;
		this.time = time;
	}

	public String getToken() {
		return this.jwttoken;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}