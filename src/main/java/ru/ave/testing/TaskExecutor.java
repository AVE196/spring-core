package ru.ave.testing;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {

//    private Task task;
    private ObjectProvider<Task> provider;

//    public TaskExecutor(Task task) {
//        this.task = task;
//    }


    public TaskExecutor(ObjectProvider<Task> provider) {
        this.provider = provider;
    }

    public void executeTask() {
        System.out.println(provider.getObject());
    }

}
