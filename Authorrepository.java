package repository;

import entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Authorrepository extends JpaRepository<Author,Long>{
}
