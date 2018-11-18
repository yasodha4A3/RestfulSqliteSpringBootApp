package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class MavenController {
	@Autowired
	UserService service;

	@GetMapping("/")
	public String display() {
		return "Hello";
	}
	
	@GetMapping("/getUsers")
	public List<User> getUserData(){
		return service.getAllUserInfo();
		
	}
}
