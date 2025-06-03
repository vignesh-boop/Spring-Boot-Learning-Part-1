package com.properties.properties;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	
//	constructor injuction for object creation
	
	private  Repocitory repository;
	
	public BookService(Repocitory repository) {
		this.repository = repository;
	}
	
//	Getting all the books from the data base
	public List<Book> getAllBooks(){
		return repository.findAll();
	}
	
//	user enter the book details the details has been saved by this method
	public Book saveBook(Book book) {
		return repository.save(book);
	}
	
//	withpout returning anything deleting the content by using the content id
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	

}
