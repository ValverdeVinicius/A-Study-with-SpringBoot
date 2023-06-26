package com.viniciusvalverde.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusvalverde.estudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
