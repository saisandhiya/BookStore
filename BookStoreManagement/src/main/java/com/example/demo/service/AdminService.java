package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bookdetails.BookDetails;
import com.example.demo.bookdetails.Login;

@Service
public interface AdminService {
	BookDetails saveBook(BookDetails b);
	List<BookDetails> getAllBooks();
	BookDetails getBookByName(int Bcode);
	BookDetails getBookByCode(int Bcode);
	BookDetails updateBook(Integer Bcode,BookDetails b );
	void deleteBookByCode(Integer Bcode);
	List<BookDetails> deleteList();
}
