package com.viniciusvalverde.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusvalverde.estudo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
