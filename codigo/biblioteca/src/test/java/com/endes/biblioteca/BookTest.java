package com.endes.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.endes.biblioteca.enumerado.Language;

class BookTest {

	private BookItem bookItem;

    @BeforeEach
    void setUp() {
        // Initialize a BookItem object before each test
        bookItem = new BookItem("123-4567890123", "Test Book", "Summary of test book", "Test Publisher", new Date(), 300, Language.EN);
    }
    @Test
    void testBookItemCreation() {
        assertNotNull(bookItem.getBarcode(), "Barcode should not be null after creation");
        assertTrue(bookItem.getIsRefereceOnly(), "Book should be reference only by default");
        assertEquals("123-4567890123", bookItem.getISBN(), "ISBN should match the constructor argument");
    }

    @Test
    void testSetAndGetBarcode() {
        String newBarcode = "987654321";
        bookItem.setBarcode(newBarcode);
        assertEquals(newBarcode, bookItem.getBarcode(), "Barcode should be updated with the setter");
    }
    

    @Test
    void testToString() {
        String resultString = bookItem.toString();
        assertTrue(resultString.contains("BookItem"), "toString should include 'BookItem'");
        assertTrue(resultString.contains("123-4567890123"), "toString should include the ISBN");
    }
}
