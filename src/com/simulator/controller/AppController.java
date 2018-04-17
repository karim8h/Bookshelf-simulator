package com.simulator.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simulator.bookshelf.Engine;
import com.simulator.model.UserController;

@Controller
public class AppController {
	@Autowired
	private Engine engine;
	@Autowired
	private UserController userController;
	
	@GetMapping
	public void greet(HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().println("Hello!");
	}
	
	@GetMapping("/makeshelf")
	public void  makeShelf(String title, String author, String category) {
		// TODO
	}
	
	@GetMapping("/api")
	public void  getBooksAPI(String title, String author, String category) {
		// TODO
	}
	
	@GetMapping("/signup")
	public void  signup(String name, String email, String password) {
		// TODO
	}
	
	@GetMapping("/login")
	public void  login(String name, String password) {
		// TODO
	}
	
	@GetMapping("/logout")
	public void  logout(String name) {
		// TODO
	}
}
