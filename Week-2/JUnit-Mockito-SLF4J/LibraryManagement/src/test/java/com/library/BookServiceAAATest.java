package com.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BookServiceAAATest {

    private BookService bookService;

    @BeforeAll
    static void initAll() {
        System.out.println("=== Starting BookService Tests ===");
    }

    @BeforeEach
    void setUp() {
        bookService = new BookService();
        System.out.println("BookService initialized for test");
    }

    @AfterEach
    void tearDown() {
        bookService = null;
        System.out.println("BookService cleaned up after test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("=== All BookService Tests Completed ===");
    }

    @Test
    void testGetBookById_AAA() {
        // ARRANGE
        int bookId = 1;
        String expectedTitle = "The Great Gatsby";

        // ACT
        String actualTitle = bookService.getBookById(bookId);

        // ASSERT
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void testGetBookById_InvalidId_AAA() {
        // ARRANGE
        int invalidId = 999;

        // ACT
        String result = bookService.getBookById(invalidId);

        // ASSERT
        assertNull(result);
    }

    @Test
    void testIsBookAvailable_AAA() {
        // ARRANGE
        int availableId = 1;
        int unavailableId = 999;

        // ACT
        boolean isAvailable = bookService.isBookAvailable(availableId);
        boolean isUnavailable = bookService.isBookAvailable(unavailableId);

        // ASSERT
        assertTrue(isAvailable);
        assertFalse(isUnavailable);
    }
}