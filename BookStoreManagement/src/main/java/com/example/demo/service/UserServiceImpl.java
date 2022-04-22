package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bookdetails.BookDetails;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public List<BookDetails> getAllBooks() 	{  
	List<BookDetails> books = new ArrayList<>();  
	userRepo.findAll().forEach(books1 -> books.add(books1));  
	return books;  
	}  

	public BookDetails getBookByCode(Integer Bcode) {  
	return userRepo.findById(Bcode).get();  
	}

	@Override
	public long calculatePrice(int q, int p) {
		// TODO Auto-generated method stub
		BookDetails bookDetails= null;
		int amount = (bookDetails.getQuantity())*(bookDetails.getPrice());
		return amount;
		
	}


}
