package ru.ave.testing;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TaskManager {

    private Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    public void printTask() {
        System.out.println(task);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Object construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Object preDestroy");
    }

}
