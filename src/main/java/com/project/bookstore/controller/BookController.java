package com.project.bookstore.controller;

import com.project.bookstore.domain.Book;
import com.project.bookstore.responseEntity.BookResponseEntity;
import com.project.bookstore.service.BookService;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins="http://localhost:4200",methods={RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@CrossOrigin(originPatterns = "*", origins = "*")
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping({"","/"})
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> book = bookService.findAllBook();
        return new BookResponseEntity(book, HttpStatus.OK);
    }

    @Cacheable(value = "books", key = "#id")
    @GetMapping("/{id}")
    public ResponseEntity<Book> getAllBookById(@PathVariable("id") Long id){
        Book book = bookService.findBookById(id);
        return new BookResponseEntity(book,HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book newBook = bookService.addBook(book);
        System.out.println(newBook.getAuthor()+newBook.getTitle());
        return new BookResponseEntity(newBook,HttpStatus.CREATED);
    }

    @CachePut(value = "books", key = "#book.book_id")
    @PutMapping("/")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book updateBook = bookService.updateBook(book);
        return new BookResponseEntity(updateBook,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable("id") Long id){
        System.out.println(id);
        bookService.deleteBook(id);
        return new BookResponseEntity(HttpStatus.OK);
    }
}
