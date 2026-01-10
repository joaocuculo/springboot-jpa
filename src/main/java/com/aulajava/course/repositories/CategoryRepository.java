package com.aulajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<com.aulajava.course.entities.Category, Long> {
	
}
