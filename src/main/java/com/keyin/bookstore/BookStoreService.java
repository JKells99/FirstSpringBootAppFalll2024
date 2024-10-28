package com.keyin.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookStoreService {

    @Autowired
    private BookStoreRepository bookStoreRepository;

    public BookStore createBookStore(BookStore bookStore) {
        return bookStoreRepository.save(bookStore);
    }

    public BookStore findByBookStoreName(String bookStoreName) {
        return bookStoreRepository.findByName(bookStoreName);

    }
}
