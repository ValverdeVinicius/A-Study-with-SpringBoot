package com.viniciusvalverde.estudo.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.viniciusvalverde.estudo.entities.Category;

public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long> {
	
}
