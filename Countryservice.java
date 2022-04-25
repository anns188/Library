package service;

import entity.Country;

import java.util.List;

public interface Countryservice {
    List<Country>findAll();
    void deleteById();

}
