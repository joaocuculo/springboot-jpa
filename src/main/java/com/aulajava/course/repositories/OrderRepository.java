package com.aulajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajava.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
