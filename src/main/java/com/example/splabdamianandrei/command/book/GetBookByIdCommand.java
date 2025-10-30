package com.example.splabdamianandrei.command.book;

import com.example.splabdamianandrei.command.AbstractCommand;
import com.example.splabdamianandrei.model.entities.Book;
import com.example.splabdamianandrei.service.BookService;

public class GetBookByIdCommand  extends AbstractCommand<Book> {

    private Integer bookId;

    public GetBookByIdCommand(BookService bookService, Integer bookId){
        super(bookService);
        this.bookId = bookId;
    }

    @Override
    public Book execute(){
        return bookService.getBookById(bookId);
    }

}
