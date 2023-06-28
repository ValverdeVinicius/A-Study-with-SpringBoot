package com.viniciusvalverde.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusvalverde.estudo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
