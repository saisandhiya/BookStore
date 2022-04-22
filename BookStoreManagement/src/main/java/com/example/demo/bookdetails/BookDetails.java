package com.example.demo.bookdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class BookDetails {
	@Id
	int bookCode;
	String bookType;
	String bookName;
	int quantity;
	int price;
	public BookDetails() {
		super();
	}
	public BookDetails(int bookCode, String bookType, String bookName, int quantity, int price) {
		super();
		this.bookCode = bookCode;
		this.bookType = bookType;
		this.bookName = bookName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookDetails [bookCode=" + bookCode + ", bookType=" + bookType + ", bookName=" + bookName + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	
	
	
	
	

}
