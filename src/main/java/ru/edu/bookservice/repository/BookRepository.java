package ru.edu.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.edu.bookservice.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
