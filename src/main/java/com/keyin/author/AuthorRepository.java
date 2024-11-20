package com.keyin.author;

import com.keyin.book.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported = false)
public interface AuthorRepository extends CrudRepository<Author,Long> {

    public Author findByAuthorName(String authorName);

}


