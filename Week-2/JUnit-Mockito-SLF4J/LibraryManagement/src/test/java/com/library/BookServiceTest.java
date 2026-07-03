package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BookServiceTest {

    @Test
    public void testGetBookById_Found() {
        BookService service = new BookService();
        String book = service.getBookById(1);
        assertEquals("The Great Gatsby", book);
    }

    @Test
    public void testGetBookById_NotFound() {
        BookService service = new BookService();
        String book = service.getBookById(99);
        assertNull(book);
    }

    @Test
    public void testIsBookAvailable_True() {
        BookService service = new BookService();
        assertTrue(service.isBookAvailable(1));
    }

    @Test
    public void testIsBookAvailable_False() {
        BookService service = new BookService();
        assertFalse(service.isBookAvailable(99));
    }

    @Test
    public void testGetBookById_NotNull() {
        BookService service = new BookService();
        assertNotNull(service.getBookById(2));
    }
}