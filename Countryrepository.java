package repository;

import entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Countryrepository extends JpaRepository<Country,Long> {
}
