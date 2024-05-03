package com.endes.biblioteca;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.endes.biblioteca.enumerado.Language;

import java.util.Date;


public class AuthorTest {
    
    private Author author;
    @Mock
    private Book book;


    @BeforeEach
    void setUp() {

        author = new Author("John Doe", "Biography of John Doe");
        book = new BookItem("978-3-16-148410-0", "Test Book", "This is a test book.", "Test Publisher", new Date(), 123, Language.EN);
        when(book.getISBN()).thenReturn("978-3-16-148410-0");
    }

    @Test
    @DisplayName("Author can add a book")
    void testAddBook() {
        author.addBook(book);
        assertTrue(author.getBooks().contains(book), "Book should be added to the author's books");
    }

    @Test
    @DisplayName("Duplicate books are not added")
    void testNoDuplicateBooks() {
        author.addBook(book);
        author.addBook(book); // Try to add the same book again
        assertEquals(1, author.getBooks().size(), "There should only be one instance of the book in the author's book set");
    }

    @Test
    @DisplayName("Author details are correct")
    void testAuthorDetails() {
        assertEquals("John Doe", author.getName(), "Author name should be correctly stored");
        assertEquals("Biography of John Doe", author.getBiography(), "Author biography should be correctly stored");
    }
}