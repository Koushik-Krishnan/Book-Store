package com.project.bookstore.service;
import com.project.bookstore.domain.Book;
import com.project.bookstore.exceptinHandeling.BookNotFoundException;
import com.project.bookstore.repository.BookRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBook(){
        return bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepository.findBookById(id).orElseThrow(()->new BookNotFoundException("Book by id"+id+"was not found"));
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }
}
