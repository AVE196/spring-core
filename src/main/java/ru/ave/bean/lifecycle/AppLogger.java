package ru.ave.bean.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class AppLogger {

    public AppLogger() {
        System.out.println("Constructor run: AppLogger");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct run: AppLogger");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("PreDestroy run: AppLogger");

    }
}
