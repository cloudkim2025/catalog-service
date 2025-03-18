package com.example.catalogservice.excption;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super("Book already exists: " + isbn);

    }
}
