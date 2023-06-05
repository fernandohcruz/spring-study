package com.fernando.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.study.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
