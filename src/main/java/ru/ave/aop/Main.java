package ru.ave.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Main {

    static void main() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigAOPPackage.class);
        UserService service = context.getBean(UserService.class);

        service.findUser("alex", "null", LocalDateTime.now());
        service.findUser("alex", null, LocalDateTime.now());

    }

}
