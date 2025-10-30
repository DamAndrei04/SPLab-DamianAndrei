package com.example.splabdamianandrei.controller;

import com.example.splabdamianandrei.command.AsynchronousCommandExecutor;
import com.example.splabdamianandrei.command.Command;
import com.example.splabdamianandrei.command.CommandExecutor;
import com.example.splabdamianandrei.command.SynchronousCommandExecutor;
import com.example.splabdamianandrei.command.book.*;
import com.example.splabdamianandrei.model.entities.Book;
import com.example.splabdamianandrei.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    private final CommandExecutor syncExecutor;
    private final CommandExecutor asyncExecutor;

    public BookController(BookService bookService,
                          SynchronousCommandExecutor syncExecutor,
                          AsynchronousCommandExecutor asyncExecutor) {
        this.bookService = bookService;
        this.syncExecutor = syncExecutor;
        this.asyncExecutor = asyncExecutor;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        Command<List<Book>> getAllBooksCommand = new GetAllBooksCommand(bookService);

        return ResponseEntity.ok(syncExecutor.executeCommand(getAllBooksCommand));
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer bookId){
        Command<Book> getBookByIdCommand = new GetBookByIdCommand(bookService, bookId);

        return ResponseEntity.ok(syncExecutor.executeCommand(getBookByIdCommand));
    }

    @PostMapping
    public ResponseEntity<?> createBook(@RequestBody Book book){
        Command<Book> createBookCommand = new CreateBookCommand(bookService, book);

        asyncExecutor.executeCommand(createBookCommand);
        return ResponseEntity.accepted().build();
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Book> modifyBook(@RequestBody Book book, @PathVariable Integer bookId){
        Command<Book> modifyBookCommand = new UpdateBookCommand(bookService, book, bookId);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(syncExecutor.executeCommand(modifyBookCommand));
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Integer bookId){
        Command<Void> deleteBookCommand = new DeleteBookCommand(bookService, bookId);
        syncExecutor.executeCommand(deleteBookCommand);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
