package com.properties.properties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String bookName;
	private String autherName;
	private double price;
	
	public Book() {
	}
	
	
	public Book(Long id,String bookName,String autherName,double price) {
		this.id = id;
		this.bookName= bookName;
		this.autherName =  autherName;
		this.price = price;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;	
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAutherName() {
		return autherName;
	}


	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
}
