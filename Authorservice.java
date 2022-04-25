package service;

import entity.Author;

import java.util.List;
import java.util.Optional;

public interface Authorservice {
    List<Author>findAll();
    Optional<Author>findById(Long id);
    void deleteById(Long id);


}
