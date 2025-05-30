package com.spidertech.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spidertech.study.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
