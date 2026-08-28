package ru.ave;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class LibraryConfig {

//    @Bean("simple-book")
    public Book book() {
        return new Book();
    }

//    @Bean
    public Library library(Book book) {
        return new Library(book);
    }

}
