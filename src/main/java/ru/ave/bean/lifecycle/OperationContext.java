package ru.ave.bean.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class OperationContext {

    public OperationContext() {
        System.out.println("Constructor run: OperationContext");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct run: OperationContext");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("PreDestroy run: OperationContext");

    }
}
