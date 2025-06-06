package com.spidertech.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spidertech.study.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
