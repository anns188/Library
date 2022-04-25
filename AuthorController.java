package controller;

import entity.Author;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Authorservice;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
    private final Authorservice authorservice;

    public AuthorController(Authorservice authorservice) {
        this.authorservice = authorservice;
    }
    @GetMapping
    public ResponseEntity<List<Author>>listAllAuthors(){
        return ResponseEntity.ok(authorservice.findAll());
    }

    public ResponseEntity<Author>findById(@PathVariable Long id){
        return ResponseEntity.of(authorservice.findById(id));
    }


}
