package com.example.splabdamianandrei.repository.adapter;

import com.example.splabdamianandrei.model.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataBookRepository extends JpaRepository<Book, Integer> {

}
