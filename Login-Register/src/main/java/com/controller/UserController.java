package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.user;
import com.repo.UserRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserRepo repo;
	
	@PostMapping("/user")
	public ResponseEntity<user> registerUser(@RequestBody user user) {
		
		logger.info("Controller called");
	 return ResponseEntity.ok(repo.save(user));
		
		
	}

}