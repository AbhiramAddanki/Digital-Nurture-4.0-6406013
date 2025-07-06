package com.example.service;

import com.example.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter Injection
    public void setRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showAllBooks() {
        System.out.println("BookService: Displaying all books...");
        bookRepository.loadBookData();
    }

    public void checkService() {
        System.out.println("BookService: Service check complete.");
        bookRepository.repositoryInfo();
    }
}
