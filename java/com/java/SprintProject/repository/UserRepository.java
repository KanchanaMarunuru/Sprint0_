package com.java.SprintProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.SprintProject.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
