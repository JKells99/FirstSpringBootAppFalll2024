package com.keyin.book;

import com.keyin.author.Author;
import com.keyin.bookstore.BookStore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface BookRepository extends CrudRepository<Book,Long> {

    Iterable<Book> findBooksByAuthorAuthorName(String author_authorName);
    Iterable<Book> findBooksByStoreList_Name(String  storeName);


}
