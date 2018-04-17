package com.simulator.model;

import java.util.ArrayList;
import java.util.List;

public class UserController {
	private List<User> loggedInUsers;

	public UserController() {
		this.loggedInUsers = new ArrayList<>();
	}
	
	public boolean createUser(String name, String email, String password) {
		// TODO
		return false;
	}
	
	public boolean authenticateUser(String name, String password) {
		// TODO
		return false;
	}
	
	public boolean userExists(String name) {
		// TODO
		return false;
	}
	
	public boolean isLoggedIn(String name) {
		// TODO
		return false;
	}
	
	public boolean signUserIn(String name) {
		// TODO
		return false;
	}
	
	public boolean signUserOut(String name) {
		// TODO
		return false;
	}
	
}
