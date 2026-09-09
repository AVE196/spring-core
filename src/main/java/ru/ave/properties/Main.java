package ru.ave.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PlannerProperties properties = context.getBean(PlannerProperties.class);

//        System.out.println(properties);

        PlannerService service = context.getBean(PlannerService.class);
        service.printConfig();

    }
}
