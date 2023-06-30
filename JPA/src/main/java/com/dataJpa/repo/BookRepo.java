package com.dataJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.dataJpa.modal.Book;

public interface BookRepo extends JpaRepository<Book, Integer> 
{

}
