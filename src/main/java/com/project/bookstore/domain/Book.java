package com.project.bookstore.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "book_store")
@Table(name = "book")
public class Book{
    @Id
    @Column(name="book_id")
    private Long id;

    @Column(name="book_title")
    private String title ;

    @Column(name="book_author")
    private String author;

    @Column(name="book_price")
    private float price;

    @Column(name="book_rating")
    private float rating;

    @Column(name="book_category")
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name="number_of_pages")
    private int numberOfPages;

    @Column(name="book_publication_date")
    private LocalDate dateOfPublication;

    public Book(Long id, String title, String author, float price, float rating, Category category, int numberOfPages, LocalDate dateOfPublication) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.rating = rating;
        this.category = category;
        this.numberOfPages = numberOfPages;
        this.dateOfPublication = dateOfPublication;
    }

    public Book() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

}
