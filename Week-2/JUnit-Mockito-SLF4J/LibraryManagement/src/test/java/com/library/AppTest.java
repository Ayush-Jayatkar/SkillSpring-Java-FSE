package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testJUnitSetup() {
        assertTrue(true, "JUnit 5 is set up correctly!");
    }

    @Test
    public void testBookServiceNotNull() {
        BookService service = new BookService();
        assertNotNull(service, "BookService should not be null");
    }
}