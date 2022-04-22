package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bookdetails.BookDetails;
import com.example.demo.bookdetails.Login;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private UserRepository userRepo;	
	
	public AdminServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public BookDetails saveBook(BookDetails b) {
		return userRepo.save(b);
		
	}

	@Override
	public List<BookDetails> getAllBooks()   
	{  
	List<BookDetails> books = new ArrayList<>();  
	userRepo.findAll().forEach(books1 -> books.add(books1));  
	return books;  
	}  

	
	  @Override public BookDetails getBookByName(int Bcode) {
	  Optional<BookDetails> bk = userRepo.findById(Bcode);
	  BookDetails bookDetails = null; 
	  if (bk.isPresent()) { 
		  bookDetails = bk.get(); } 
	  else {
		  throw new RuntimeException(" Book not found for id :: " + Bcode); 
		  } return bookDetails;
	  }
	 
	/*
	 * public BookDetails getBookByName(String Bname) { return
	 * userRepo.findById(Bname).get(); }
	 * 
	 * @Override public void deleteBookByName(String Bname) {
	 * userRepo.deleteById(Bname);
	 * 
	 * }
	 */

	@Override
	public BookDetails updateBook(Integer Bcode,BookDetails b) {
		BookDetails old = getBookByCode(Bcode);
		old.setBookCode(b.getBookCode());
		old.setBookType(b.getBookType());
		old.setBookName(b.getBookName());
		old.setQuantity(b.getQuantity());
		old.setPrice(b.getPrice());		
		return userRepo.save(old);
	}

	
	@Override
	public List<BookDetails> deleteList() {
		List<BookDetails> books = new ArrayList<>();  
		userRepo.deleteAllInBatch(); 
		return books; 
	}

	@Override
	public BookDetails getBookByCode(int Bcode) {
		return userRepo.findById(Bcode).get();
	}

	@Override
	public void deleteBookByCode(Integer Bcode) {
		userRepo.deleteById(Bcode);		
	}

	



}
