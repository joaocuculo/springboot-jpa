package com.aulajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajava.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
