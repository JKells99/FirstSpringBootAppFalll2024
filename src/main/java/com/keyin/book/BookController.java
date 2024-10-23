package com.keyin.book;

import com.keyin.author.Author;
import com.keyin.author.AuthorService;
import com.keyin.publisher.Publisher;
import com.keyin.publisher.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/listAllBooks")
    public ResponseEntity<Iterable<Book>> getAllBooks() {
         bookService.getAllBooks();
         return  ResponseEntity.ok().body(bookService.getAllBooks());
    }

    @PostMapping("/addNewBook")
    public Book addNewBook(@RequestBody Book book) {
        Optional<Author> authorOptional = Optional.ofNullable(authorService.findByAuthorName(book.getAuthor().getAuthorName()));
        Optional<Publisher> publisherOptional = Optional.ofNullable(publisherService.findByPublisherName(book.getPublisher().getPublisherName()));

        Author author;
        if (authorOptional.isPresent()) {
            author = authorOptional.get();
        } else {
            // Save the new author if it doesn't exist
            author = book.getAuthor();
            authorService.createNewAuthor(author);
        }
        book.setAuthor(author);

        Publisher publisher;
        if (publisherOptional.isPresent()) {
            publisher = publisherOptional.get();
        } else {

            publisher = book.getPublisher();
            publisherService.createNewPublisher(publisher);
        }
        book.setPublisher(publisher);
        return bookService.AddBook(book);

    }

    @GetMapping("/getBooksForAuthor")
    public Iterable<Book> getBooksForAuthor(@RequestParam("authorName") String authorName) {
        return bookService.findByAuthor(authorName);
    }


}
