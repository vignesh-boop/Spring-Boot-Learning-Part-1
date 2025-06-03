package com.properties.properties;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class Controller {
	
	private BookService service;
	
	public Controller(BookService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Book> getBooks(){
		return service.getAllBooks();
	}
	@PostMapping
	public Book adddBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	@DeleteMapping
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
	

}
