package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.bookdetails.BookDetails;


@Repository
public interface UserRepository extends JpaRepository<BookDetails, Integer>{

}
