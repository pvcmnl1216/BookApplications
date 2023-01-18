package com.niit.Book.service;

import com.niit.Book.domain.Book;

import java.util.List;

public interface BookService {
    public Book addBook(Book book);
    public List<Book> getBooks();
}
