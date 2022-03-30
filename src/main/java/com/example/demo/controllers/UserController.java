package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repositories.UserRepository;


@Controller
public class UserController {
	
	private UserRepository userRepo;
	
	@RequestMapping(method= RequestMethod.POST, value="/signup")
	public ResponseEntity<?> studentSignUp(String email) {
		if(userRepo.existsByEmail(email)) {
			return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
		}
		//return null;
	}
}
