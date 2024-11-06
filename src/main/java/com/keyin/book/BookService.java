package com.keyin.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book AddBook(Book book) {
        return bookRepository.save(book);
    }

    public Iterable<Book> findByAuthor(String authorName) {
        return bookRepository.findBooksByAuthorAuthorName(authorName);
    }

    public Iterable<Book> findByStoreName(String storeName) {
        return bookRepository.findBooksByStoreList_Name(storeName);
    }
}
