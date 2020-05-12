package com.marcohnp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcohnp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
