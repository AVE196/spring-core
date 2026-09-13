package ru.ave.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigIoC.class);

        UserMessagePrinter printer = context.getBean(UserMessagePrinter.class);
        printer.printMessage("alEx");
        printer.testMethodPrinter();
    }

}
