package com.keyin.publisher;

import com.keyin.author.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported = false)
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

    public Publisher findByPublisherName(String publisherName);

}
