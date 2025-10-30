package com.example.splabdamianandrei.command.book;

import com.example.splabdamianandrei.command.AbstractCommand;
import com.example.splabdamianandrei.service.BookService;

public class DeleteBookCommand extends AbstractCommand<Void> {
    private Integer bookId;

    public DeleteBookCommand(BookService bookService, Integer bookId){
        super(bookService);
        this.bookId = bookId;
    }

    @Override
    public Void execute(){
        return bookService.deleteBook(bookId);
    }
}
