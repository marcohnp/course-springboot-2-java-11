package com.marcohnp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcohnp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
