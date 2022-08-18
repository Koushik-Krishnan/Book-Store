package com.project.bookstore.controller;

import com.project.bookstore.domain.Book;
import com.project.bookstore.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Book>> getAllUser(){
        List<Book> book = bookService.findAllBook();
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getAllUserById(@PathVariable("id") Long id){
        Book book = bookService.findBookById(id);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Book> addBook(Book book){
        Book newBook = bookService.addBook(book);
        return new ResponseEntity<>(newBook,HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Book> updateUser(@RequestBody Book book){
        Book updateBook = bookService.updateBook(book);
        return new ResponseEntity<>(updateBook,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
