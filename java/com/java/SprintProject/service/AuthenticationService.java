package com.java.SprintProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.java.SprintProject.entity.User;
import com.java.SprintProject.repository.UserRepository;

@Service
public class AuthenticationService {

//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	public boolean authenticate(String username, String password) {
//		User user = userRepository.findByUsername(username);
//		
//		if(user!=null) {
//			return passwordEncoder.matches(password, user.getPassword());
//		}
//		return false;
//	}
	
}
