package com.example.splabdamianandrei.command;

import com.example.splabdamianandrei.service.BookService;

public abstract class AbstractCommand<T> implements Command<T> {
    protected BookService bookService;

    public AbstractCommand(BookService bookService){
        this.bookService = bookService;
    }
}
