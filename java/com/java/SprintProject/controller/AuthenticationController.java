
package com.java.SprintProject.controller;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
 
import com.java.SprintProject.entity.User;

import com.java.SprintProject.repository.UserRepository;

import com.java.SprintProject.service.AuthenticationService;
 
@RestController

@RequestMapping("/api/v1/")

@CrossOrigin(origins = "http://localhost:4200/")

public class AuthenticationController {
 
	@Autowired

	private AuthenticationService authenticationService;

	@Autowired

	private UserRepository userRepository;

//	public String login(@RequestParam String username, @RequestParam String password) {

//		if(authenticationService.authenticate(username, password)) {

//			return "Login successful";

//		}

//		else {

//			return "Invalid credentials";

//		}

//	}

	@PostMapping("/login")

	public User createUser(@RequestBody User user) {

		return userRepository.save(user);

	}

}
