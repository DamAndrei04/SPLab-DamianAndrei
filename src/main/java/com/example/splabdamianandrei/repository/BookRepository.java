package com.example.splabdamianandrei.repository;

import com.example.splabdamianandrei.model.entities.Book;
import com.example.splabdamianandrei.repository.adapter.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
