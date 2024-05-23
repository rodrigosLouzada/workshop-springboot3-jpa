package com.courseSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseSpring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
