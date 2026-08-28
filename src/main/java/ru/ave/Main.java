package ru.ave;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.ave");
        //AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library library = applicationContext.getBean(Library.class);
        System.out.println(library.getBook());
    }

}
