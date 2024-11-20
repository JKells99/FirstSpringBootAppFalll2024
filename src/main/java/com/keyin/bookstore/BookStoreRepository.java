package com.keyin.bookstore;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(exported = false)
public interface BookStoreRepository extends CrudRepository<BookStore, Integer> {

    BookStore findByName(String name);
}
