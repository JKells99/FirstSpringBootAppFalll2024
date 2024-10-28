package com.keyin.bookstore;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface BookStoreRepository extends CrudRepository<BookStore, Integer> {

    BookStore findByName(String name);
}
