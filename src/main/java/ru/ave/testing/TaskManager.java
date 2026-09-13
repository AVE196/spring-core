package ru.ave.testing;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.ave.testing.aop.SomeAnnotation;

@Component
@Scope("prototype")
public class TaskManager {

    private Task task;

    private ObjectProvider<Task> provider;

//    public TaskManager(Task task) {
//        this.task = task;
//    }

//    public void printTask() {
//        System.out.println(task);
//    }


    public TaskManager(ObjectProvider<Task> provider) {
        this.provider = provider;
    }

    @SomeAnnotation
    public void printTask() {
        System.out.println(provider.getObject());
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
