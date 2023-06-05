package com.fernando.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.study.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
