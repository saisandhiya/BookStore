package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bookdetails.BookDetails;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/books")  
	public List<BookDetails> getAllBooks()	{  
	return service.getAllBooks();  
	}  
	
	@GetMapping("/books/{bookCode}")  
	public BookDetails getBooks(@PathVariable(value="bookCode") Integer bookCode)	{  
	return service.getBookByCode(bookCode);  
	}
	
	@GetMapping("/amount")
	public long buyBook(@PathVariable(value="amount") Integer p,Integer q) {
		return service.calculatePrice(q,p);
	}
	
	
}
