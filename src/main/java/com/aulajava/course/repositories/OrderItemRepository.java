package com.aulajava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajava.course.entities.OrderItem;
import com.aulajava.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
