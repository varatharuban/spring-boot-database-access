package com.rubanlearning.springbootdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubanlearning.springbootdb.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}