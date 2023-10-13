package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.OrderItem;
import com.example.demo.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
