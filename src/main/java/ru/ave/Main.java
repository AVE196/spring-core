package ru.ave;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserMessagePrinter printer = context.getBean(UserMessagePrinter.class);
        printer.printMessage("alEx");
        printer.testMethodPrinter();
    }

}
