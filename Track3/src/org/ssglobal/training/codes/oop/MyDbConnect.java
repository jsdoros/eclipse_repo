package org.ssglobal.training.codes.oop;

import java.sql.Connection;

public class MyDbConnect {

	private String username;
	private String password;
	private String jdgcUrl;
	private Connection conn;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}

