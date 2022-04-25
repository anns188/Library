package controller;


import entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Bookservice;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

   private final Bookservice bookservice;


    public BookController(Bookservice bookservice) {
        this.bookservice = bookservice;
    }

    public Bookservice getBookservice() {
        return bookservice;
    }

    public ResponseEntity<List<Book>>findAll(){
        return ResponseEntity.ok(this.bookservice.findAll());
    }

}
