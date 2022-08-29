package com.project.bookstore.responseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;

import java.io.Serializable;

public class BookResponseEntity extends org.springframework.http.ResponseEntity implements Serializable {

    public BookResponseEntity(HttpStatus status) {
        super(status);
    }

    public BookResponseEntity(Object body, HttpStatus status) {
        super(body, status);
    }

    public BookResponseEntity(MultiValueMap headers, HttpStatus status) {
        super(headers, status);
    }

    public BookResponseEntity(Object body, MultiValueMap headers, HttpStatus status) {
        super(body, headers, status);
    }

    public BookResponseEntity(Object body, MultiValueMap headers, int rawStatus) {
        super(body, headers, rawStatus);
    }
}
