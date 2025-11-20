package com.example.splabdamianandrei.service;

import com.example.splabdamianandrei.model.entities.Book;
import com.example.splabdamianandrei.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BookService{

    public final BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Integer id){
        try {
            Optional<Book> book = bookRepository.findById(id);
            if(book.isPresent()) return book.get();
            else throw new RuntimeException(String.format("Book with the following id: % doesn't exit", id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Transactional
    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    @Transactional
    public Book updateBook(Book book, Integer id){
        try {
            Book selectedBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("Book with the following id: % doesn't exist", id)));
            mapToEntity(selectedBook, book);
            return bookRepository.save(selectedBook);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Void deleteBook(Integer id){
        try{
            bookRepository.deleteById(id);
        }catch (Exception e){
        }
        return null;
    }

    private void mapToEntity(Book entitySource, Book entityDestination){
        entityDestination.setTitle(entitySource.getTitle());
        entityDestination.setElements(entitySource.getElements());
        entityDestination.setAuthors(entitySource.getAuthors());
    }
}