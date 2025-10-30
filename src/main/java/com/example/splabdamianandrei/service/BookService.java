package com.example.splabdamianandrei.service;

import com.example.splabdamianandrei.model.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService{

    protected static List<Book> books = new ArrayList<>(List.of(new Book(), new Book(), new Book()));

    public List<Book> getAllBooks(){
        return books;
    }

    public Book getBookById(Integer id){
        try {
            return books.get(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Book createBook(Book book){
        books.add(book);
        return books.get(books.indexOf(book));
    }

    public Book updateBook(Book book, Integer id){
        try {
            books.set(id, book);
            return books.get(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Void deleteBook(Integer id){
        try{
            books.remove((int) id);
        }catch (Exception e){
        }
        return null;
    }

}