package com.example.splabdamianandrei.command.book;

import com.example.splabdamianandrei.command.AbstractCommand;
import com.example.splabdamianandrei.model.entities.Book;
import com.example.splabdamianandrei.service.BookService;

public class UpdateBookCommand extends AbstractCommand<Book> {

    private Book bookToUpdate;
    private Integer bookId;

    public UpdateBookCommand(BookService bookService, Book bookToUpdate, Integer bookId){
        super(bookService);
        this.bookToUpdate = bookToUpdate;
        this.bookId = bookId;
    }

    @Override
    public Book execute(){
        return bookService.updateBook(bookToUpdate, bookId);
    }
}
