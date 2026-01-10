package com.aulajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajava.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
