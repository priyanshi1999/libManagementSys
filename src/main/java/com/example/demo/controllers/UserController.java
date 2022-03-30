package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	

	@PostMapping("/signup")
	public User studentSignUp(@RequestBody User userData) {
		//User res= null;
//		if(userRepo.existsByEmail(email)) {
//			//return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
//			res= "Email is already taken!";
//			return res;
//		}
		System.out.println("Heyy!");
		userRepo.save(userData);
		return userData;
		//return res;
	}
}
