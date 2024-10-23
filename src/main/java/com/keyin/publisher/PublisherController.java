package com.keyin.publisher;

import com.keyin.author.Author;
import com.keyin.author.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/getAllPublishers")
    public Iterable<Publisher> getListOfAuthorsInDB() {
        return publisherService.getALlPublishers();

    }
}
