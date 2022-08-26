package com.project.bookstore.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "book_store")
@Table(name = "book")
@JsonIgnoreProperties
public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Column(name="number_of_pages")
    private int numberOfPages;

    @Column(name="book_publication_date")
    private LocalDate dateOfPublication;

    @Column(name="book_image_URL")
    private String imageUrl;

    public Book(Long id, String title, String author, float price, float rating, int numberOfPages, LocalDate dateOfPublication, String imageUrl) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.rating = rating;
        this.numberOfPages = numberOfPages;
        this.dateOfPublication = dateOfPublication;
        this.imageUrl = imageUrl;
    }

    public Book() {}

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
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", numberOfPages=" + numberOfPages +
                ", dateOfPublication=" + dateOfPublication +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }


}
