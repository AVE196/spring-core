package ru.ave.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
@Scope("prototype")
public class TaskContext {

    private int id;

    public TaskContext() {
        this.id = ThreadLocalRandom.current().nextInt(0, 1000);
    }

    public long getId() {
        return id;
    }
}
