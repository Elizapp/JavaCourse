package com.example.BookTest;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/books")
public class BookController {
 
	@Autowired
	BookService service;
	@PostMapping(produces = "application/json" , consumes ="application/json" )
	public ResponseEntity<Book> addBook(@RequestBody Book book)
	{
		service.addBook(book);
		return new ResponseEntity<Book>(book, HttpStatus.CREATED);
	}
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Book>> fetchBooks()
	{
		List<Book> books=service.getBooks();// all books
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	


}