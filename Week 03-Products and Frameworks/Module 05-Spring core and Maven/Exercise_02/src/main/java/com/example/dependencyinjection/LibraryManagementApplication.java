package com.example.dependencyinjection;

import com.example.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 

        BookService bookService = (BookService) context.getBean("bookService");

        bookService.checkService();
        bookService.showAllBooks();
        context.close();
    }
}


