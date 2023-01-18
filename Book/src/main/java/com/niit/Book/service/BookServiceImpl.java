/*
 * Author Name: Philip Meshach
 * Date: 17-01-2023
 * Praise The Lord
 */
package com.niit.Book.service;

import com.niit.Book.domain.Book;
import com.niit.Book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    BookRepository bookRepository;
    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        if (bookRepository.findById(book.getBookName()).isEmpty()){
            bookRepository.save(book);
        }
        return null;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
