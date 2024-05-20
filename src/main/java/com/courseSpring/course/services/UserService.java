package com.courseSpring.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.courseSpring.course.entities.User;
import com.courseSpring.course.repositories.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
	}

}
