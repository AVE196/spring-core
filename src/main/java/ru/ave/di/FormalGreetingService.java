package ru.ave.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FormalGreetingService implements GreetingService{

    @Override
    public String greet(String name) {
        return name + ", hello.";
    }
}
