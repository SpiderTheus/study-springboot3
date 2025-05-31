package com.spidertech.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spidertech.study.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
