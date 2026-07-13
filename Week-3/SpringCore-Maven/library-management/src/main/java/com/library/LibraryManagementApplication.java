package com.library;

import com.library.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);

		// Load XML context for Exercise 1
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BookService bookService = context.getBean("bookService", BookService.class);

		System.out.println("Exercise 1: Spring XML Configuration ");
		System.out.println("Book 1: " + bookService.getBook(1));
		System.out.println("Book 2: " + bookService.getBook(2));
		System.out.println("Exercise 2: Dependency Injection ");
		System.out.println("Book found via DI: " + bookService.getBook(1));
	}
}