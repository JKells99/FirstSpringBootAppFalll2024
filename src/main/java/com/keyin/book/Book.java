package com.keyin.book;

import com.keyin.author.Author;
import com.keyin.bookstore.BookStore;
import com.keyin.publisher.Publisher;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;

    @ManyToOne
    private Author author;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<BookStore> storeList = new ArrayList<>();

    private String isbn;

    public Book() {
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<BookStore> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<BookStore> storeList) {
        this.storeList = storeList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                ", storeList=" + storeList +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
