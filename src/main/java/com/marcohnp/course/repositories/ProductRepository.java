package com.marcohnp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcohnp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
