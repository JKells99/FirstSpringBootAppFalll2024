package com.keyin.book;

import com.keyin.author.Author;
import com.keyin.bookstore.BookStore;
import com.keyin.publisher.Publisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testFindBooksByAuthorName() {
        Author author = new Author(1L ,"JaneDoe");
        Publisher publisher = new Publisher("Book Publishing Inc.","PubAdd");
        BookStore store1 = new BookStore(1L,"Downtown Books","Add1");
        BookStore store2 = new BookStore(2L,"Uptown Books","Add2");

        Book book = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book.setBookId(1L);
        book.setTitle("A Journey Through Time");
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setStoreList(Arrays.asList(store1, store2));

        book.setBookId(2L);
        book.setTitle("A Journey Through Time 2");
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setStoreList(Arrays.asList(store1, store2));

        book.setBookId(3L);
        book.setTitle("A Journey Through Time 3");
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setStoreList(Arrays.asList(store1, store2));

        when(bookRepository.findBooksByAuthorAuthorName("JaneDoe")).thenReturn(Arrays.asList(book,book2,book3));

        Iterable<Book> booksForAuthor = bookService.findByAuthor("JaneDoe");

        Assertions.assertNotNull(booksForAuthor);
        Assertions.assertEquals("A Journey Through Time 3",booksForAuthor.iterator().next().getTitle());
        Assertions.assertEquals("JaneDoe",booksForAuthor.iterator().next().getAuthor().getAuthorName());


    }


}
