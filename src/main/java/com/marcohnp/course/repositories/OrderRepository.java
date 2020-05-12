package com.marcohnp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcohnp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
