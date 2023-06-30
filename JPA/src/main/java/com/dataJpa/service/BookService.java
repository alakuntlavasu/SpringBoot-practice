package com.dataJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataJpa.modal.Book;
import com.dataJpa.repo.BookRepo;

@Service
public class BookService
{

	@Autowired
	BookRepo bRepo;
	
	// insert the data.,
	public Book insertBookData(Book bk)
	{
		Book b1 = bRepo.save(bk);
			return b1;
	}
}
