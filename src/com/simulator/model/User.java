package com.simulator.model;

public class User {
	private String name;
	private String email;
	private String password;
	
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() { return name; }
	public String getEmail() { return email; }
	public String getPassword() { return password; }

	protected void setName(String name) { this.name = name; }
	protected void setEmail(String email) { this.email = email; }
	protected void setPassword(String password) { this.password = password; }
	
}
