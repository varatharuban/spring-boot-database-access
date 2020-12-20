package com.rubanlearning.springbootdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rubanlearning.springbootdb.entity.Book;
import com.rubanlearning.springbootdb.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getBooks();
	}
	
	@PostMapping("/add-book")
	public Book addBook(@RequestBody Book book) {
		return bookService.save(book);
	}
}