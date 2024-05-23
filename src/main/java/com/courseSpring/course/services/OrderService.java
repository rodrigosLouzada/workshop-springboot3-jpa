package com.courseSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.courseSpring.course.entities.Order;
import com.courseSpring.course.repositories.OrderRepository;

public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public 	List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
