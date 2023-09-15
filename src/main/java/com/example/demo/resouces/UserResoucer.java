package com.example.demo.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResoucer {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User user = new User(1l, "Maria", "maria@gmail.com", "9999999999", "12345");
		 return ResponseEntity.ok().body(user);
		
	}
}
