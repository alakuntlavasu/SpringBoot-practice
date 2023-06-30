package com.dataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.modal.Book;
import com.dataJpa.service.BookService;

@RestController
public class BookController
{

	@Autowired
	BookService bService;
	
	// post mapping
	@PostMapping("/insertBookData")
	public Book insertBookData(@RequestBody Book bk)
	{
		Book b1 = bService.insertBookData(bk);
			return b1;
	}
}
