package com.keyin.publisher;


import com.keyin.author.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public Publisher createNewPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public Iterable<Publisher> getALlPublishers() {
        return publisherRepository.findAll();

    }

    public Publisher findByPublisherName(String publisherName) {
        return publisherRepository.findByPublisherName(publisherName);

    }




}
