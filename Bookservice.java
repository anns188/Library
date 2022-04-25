package service;

import entity.Book;

import java.util.List;
import java.util.Optional;

public interface Bookservice {
    List<Book>add();
    List<Book>remove();
    List<Book>findAll();
    Optional<Book>edit();
    void  markAsTaken(Long id);
}

