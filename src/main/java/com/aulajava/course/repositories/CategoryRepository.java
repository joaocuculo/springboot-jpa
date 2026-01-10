package com.aulajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajava.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
