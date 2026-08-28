package ru.ave;

import org.springframework.stereotype.Component;

@Component("simple-book")
public class Book {

    private long id;
    private String title;

    public Book() {
        this.id = 100;
        this.title = "Some book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
