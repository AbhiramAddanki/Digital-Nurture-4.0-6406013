package com.library.librarymanagment;


import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
          ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 

        BookService service = context.getBean("bookService", BookService.class);
        BookRepository repo = context.getBean("bookRepository", BookRepository.class);

        service.displayService();
        repo.displayRepository();
        context.close();
    }
}

