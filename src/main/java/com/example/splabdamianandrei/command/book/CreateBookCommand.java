package com.example.splabdamianandrei.command.book;

import com.example.splabdamianandrei.command.AbstractCommand;
import com.example.splabdamianandrei.model.entities.Book;
import com.example.splabdamianandrei.service.BookService;

public class CreateBookCommand extends AbstractCommand<com.example.splabdamianandrei.model.entities.Book> {
    private Book bookToCreate;

    public CreateBookCommand(BookService bookService, Book bookToCreate) {
        super(bookService);
        this.bookToCreate = bookToCreate;
    }

    @Override
    public Book execute() {
        return bookService.createBook(bookToCreate);
    }


}
