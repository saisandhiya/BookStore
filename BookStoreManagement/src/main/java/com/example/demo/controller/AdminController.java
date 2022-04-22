package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bookdetails.BookDetails;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
		@Autowired
		private AdminService service;		
		@RequestMapping("/test")
		public String tests(){
			return "Test book Controller";
		}
		
		@GetMapping("/books")  
		public List<BookDetails> getAllBooks() 	{  
		return service.getAllBooks();  
		}  
		
		/*
		 * @GetMapping("/books/{bookCode}") public BookDetails
		 * getBookByCode(@PathVariable(value="bookCode") Integer Bcode) { return
		 * service.getBookByCode(Bcode); }
		 */
		
		@GetMapping("/books/{bookCode}")  
		public BookDetails getBookByName(@PathVariable(value="bookCode") Integer Bcode) {  
		return service.getBookByName(Bcode);  
		}  
		
		
	
		@DeleteMapping("/books/delete/{bookCode}")  
		public String deleteBook(@PathVariable(value="bookCode") Integer bookCode) 		{  
		service.deleteBookByCode(bookCode);  
		return "Successfully deleted the book : '"+bookCode+"'";
		}  
			
		 
		@PostMapping("/books/add")  
		public BookDetails saveBook(@RequestBody BookDetails books)	{  
		return service.saveBook(books); 		 
		} 
		
		@PutMapping("/books/update/{bookCode}")  
		private BookDetails update(@PathVariable(value="bookCode") Integer bookCode, @RequestBody BookDetails books)  	{  
		return service.updateBook(bookCode,books);
		}  				
	 
		@DeleteMapping("/books")  
		private String deleteBook() {  
		service.deleteList();  
		return "Successfully deleted all the books ";
		}   
		
		

		
}


