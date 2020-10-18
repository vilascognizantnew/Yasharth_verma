package com.cts.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cts.customexceptions.BookNotFoundException;
import com.cts.customexceptions.BookUnSupportedFieldPatchException;
import com.cts.model.Book;
import com.cts.repository.BookRepository;

@RestController

public class BookController {

	@Autowired
	private BookRepository repository;

	// get all books
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	// save book
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book) {
		return repository.save(book);
	}

	// find one book
	@GetMapping("/books/{id}")
	Book getBookById(@PathVariable Long id) {
		Optional<Book> opBook = repository.findById(id);
		if (opBook.isPresent()) {
			return opBook.get();
		} else {
			throw new BookNotFoundException(id);
		}
	}

	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book newBook, @PathVariable Long id) {

		return repository.save(newBook);

	}

	@PatchMapping("/books/{id}")
	public Book patchBook(@RequestBody Map<String, String> update, @PathVariable Long id) {
		
		Optional<Book> opBook = repository.findById(id);
		
		if(!opBook.isPresent())
			throw new BookNotFoundException(id);
		
		String author = update.get("author");
		if (!StringUtils.isEmpty(author)) {
			Book book = opBook.get(); 
			book.setAuthor(author);
			return repository.save(book);
		}
		else {
			throw new BookUnSupportedFieldPatchException();
		}
		
	}

	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
