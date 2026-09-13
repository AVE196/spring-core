package ru.ave.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigDi.class);

        GreetingPrinterConstructor greetingPrinterConstructor = context.getBean(GreetingPrinterConstructor.class);
        greetingPrinterConstructor.print("Pasha");

        GreetingPrinterField greetingPrinterField = context.getBean(GreetingPrinterField.class);
        greetingPrinterField.print("Pasha");

        GreetingPrinterSetter greetingPrinterSetter = context.getBean(GreetingPrinterSetter.class);
        greetingPrinterSetter.print("Pasha");

    }
}
