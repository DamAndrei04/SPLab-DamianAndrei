package com.example.splabdamianandrei.command.book;

import com.example.splabdamianandrei.command.AbstractCommand;
import com.example.splabdamianandrei.model.entities.Book;
import com.example.splabdamianandrei.service.BookService;

import java.util.List;

public class GetAllBooksCommand extends AbstractCommand<List<Book>> {
    public GetAllBooksCommand(BookService bookService){
        super(bookService);
    }

    @Override
    public List<Book> execute(){
        return bookService.getAllBooks();
    }
}
