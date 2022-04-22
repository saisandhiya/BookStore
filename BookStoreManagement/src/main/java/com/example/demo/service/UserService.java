package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bookdetails.BookDetails;

@Service
public interface UserService {
	List<BookDetails> getAllBooks();
	BookDetails getBookByCode(Integer Bcode);
	long calculatePrice(int q,int p);
}
