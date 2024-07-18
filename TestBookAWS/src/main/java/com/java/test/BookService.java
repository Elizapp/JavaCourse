package com.java.test;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Service;
 
@Service
public class BookService {
 
	List<Book> books=new ArrayList<>();
	public void addBook(Book book)
	{
		books.add(book);
	}

	public List<Book> getBooks() {
		return books;
	}

	public boolean deleteBook(int id) {
		
		return books.removeIf(book -> book.id == id);
	}

}