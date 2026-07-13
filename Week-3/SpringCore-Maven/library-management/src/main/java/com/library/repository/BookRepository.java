package com.library.repository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public String findBookById(int id) {
        if (id == 1) return "The Great Gatsby";
        if (id == 2) return "To Kill a Mockingbird";
        return null;
    }
}