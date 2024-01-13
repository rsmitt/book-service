package ru.edu.bookservice.service;

import ru.edu.bookservice.model.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);
    void deleteBook(Long id);
    List<Book> findAllBooks();
}
