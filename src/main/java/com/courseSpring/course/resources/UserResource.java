package com.courseSpring.course.resources;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courseSpring.course.entities.User;
import com.courseSpring.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		// TEST -- User u = new User(1l,"Maria", "maria@gmail.com", "999999","12345");
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
