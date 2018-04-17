package com.simulator.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.simulator.bookshelf.Engine;
import com.simulator.model.UserController;


@Configuration
@ComponentScan(basePackages={"com.simulator.bookshelf"},
excludeFilters={ @Filter(type=FilterType.ANNOTATION,
	value=EnableWebMvc.class)
})
public class RootConfig {
	
	@Bean
	public Engine getEngine() {
		return new Engine();
	}

	@Bean
	public UserController getUserController() {
		return new UserController();
	}
}