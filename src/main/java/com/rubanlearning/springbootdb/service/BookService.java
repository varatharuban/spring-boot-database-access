package com.rubanlearning.springbootdb.service;

import java.util.List;

import com.rubanlearning.springbootdb.entity.Book;

public interface BookService {

	Book save(Book book);
	
	List<Book> getBooks();
}