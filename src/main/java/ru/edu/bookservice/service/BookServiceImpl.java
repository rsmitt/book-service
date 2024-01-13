package ru.edu.bookservice.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.edu.bookservice.model.Book;
import ru.edu.bookservice.repository.BookRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository repository;

    @Override
    public Book saveBook(Book book) {
        book.setCreateTime(LocalDateTime.now());
        return repository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks() {
        return repository.findAll();
    }

}
