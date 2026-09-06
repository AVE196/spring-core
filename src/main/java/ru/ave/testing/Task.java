package ru.ave.testing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
@Scope("prototype")
public class Task {

    private String name;

    private Long duration;

    public Task() {
        this.name = "Task " + ThreadLocalRandom.current().nextInt(0,100);
        this.duration = 30L;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
