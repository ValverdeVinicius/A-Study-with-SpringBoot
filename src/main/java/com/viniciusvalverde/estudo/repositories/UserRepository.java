package com.viniciusvalverde.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusvalverde.estudo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
