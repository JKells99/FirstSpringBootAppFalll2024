package com.keyin.author;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {



    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorService authorService;


    @Test
    public void testFindByAuthorName() {
        Author author = new Author();
        author.setAuthorName("Jordan");

        when(authorRepository.findByAuthorName("Jordan")).thenReturn(author);
        Author foundAuthor = authorService.findByAuthorName("Jordan");

        Assertions.assertEquals("Jordan", foundAuthor.getAuthorName());






    }
}
