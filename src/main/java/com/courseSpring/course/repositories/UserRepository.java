package com.courseSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseSpring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
