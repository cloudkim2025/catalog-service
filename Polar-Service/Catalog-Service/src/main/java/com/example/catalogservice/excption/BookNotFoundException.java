package com.example.catalogservice.excption;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {

        super("Book not found: " + isbn);
    }
}
