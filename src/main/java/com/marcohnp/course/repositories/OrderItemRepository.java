package com.marcohnp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcohnp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
