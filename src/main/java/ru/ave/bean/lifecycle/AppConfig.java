package ru.ave.bean.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.ave.bean.lifecycle")
public class AppConfig {

    static void main() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppLogger appLogger1 = context.getBean(AppLogger.class);
        AppLogger appLogger2 = context.getBean(AppLogger.class);
        System.out.println(appLogger1 == appLogger2);

        OperationContext operationContext1 = context.getBean(OperationContext.class);
        OperationContext operationContext2 = context.getBean(OperationContext.class);
        OperationContext operationContext3 = context.getBean(OperationContext.class);
        System.out.println(operationContext1 == operationContext2);

        context.close();

    }



}
