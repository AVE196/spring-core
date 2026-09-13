package ru.ave.bean.scope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class JobRunner {

//    private TaskContext taskContext;
//
//    public JobRunner(TaskContext taskContext) {
//        this.taskContext = taskContext;
//    }
//
//    public void runOnce() {
//        System.out.println(taskContext.getId());
//    }

    private ObjectProvider<TaskContext> provider;

    public JobRunner(ObjectProvider<TaskContext> provider) {
        this.provider = provider;
    }

    public void runOnce() {
        System.out.println(provider.getObject().getId());
    }
}
