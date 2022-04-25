package entity;

import jdk.jfr.Category;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="book")

public class Book {
    //id (Long), name (String),
    //category (enum), author (Author), availableCopies (Integer)
    @Id
    private  Long id;
    private  String name;
    private category cat;
    private Author author;
    private  Integer availableCopies;

    public Book(Long id, String name, category cat, Author author, Integer availableCopies) {
        this.id = id;
        this.name = name;
        this.cat = cat;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public category getCat() {
        return cat;
    }

    public void setCat(category cat) {
        this.cat = cat;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }
}
