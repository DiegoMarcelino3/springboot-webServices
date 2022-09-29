package com.diego.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
