package com.library;

public class BookService {
    public String getBookById(int id) {
        if (id == 1) return "The Great Gatsby";
        if (id == 2) return "To Kill a Mockingbird";
        return null;
    }

    public boolean isBookAvailable(int id) {
        return id == 1 || id == 2;
    }
}