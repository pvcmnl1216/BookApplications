/*
 * Author Name: Philip Meshach
 * Date: 17-01-2023
 * Praise The Lord
 */
package com.niit.Book.controller;

import com.niit.Book.domain.Book;
import com.niit.Book.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/Book")
//@CrossOrigin
public class BookController {
    BookServiceImpl bookService;
    @Autowired
    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/add")

    public ResponseEntity<?>addBooks(@RequestBody Book book){
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<?> getAllBooks(){
        return new ResponseEntity<>(bookService.getBooks(),HttpStatus.OK);
    }
}
