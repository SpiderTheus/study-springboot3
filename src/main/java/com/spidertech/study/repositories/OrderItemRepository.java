package com.spidertech.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spidertech.study.entities.OrderItem;
import com.spidertech.study.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
