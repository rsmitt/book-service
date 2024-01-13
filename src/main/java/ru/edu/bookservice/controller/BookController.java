package ru.edu.bookservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.edu.bookservice.model.Book;
import ru.edu.bookservice.service.BookService;

@RestController
@RequestMapping("api/book")
@AllArgsConstructor
public class BookController {

    private final BookService service;

    //api/book
    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        return ResponseEntity.ok(service.findAllBooks());
    }

    //api/book
    @PostMapping
    public ResponseEntity<?> saveBook(@RequestBody Book book) {
        return new ResponseEntity<>(service.saveBook(book), HttpStatus.CREATED);
    }

    //api/bok/{bookId}
    @DeleteMapping("{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId) {
        service.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
