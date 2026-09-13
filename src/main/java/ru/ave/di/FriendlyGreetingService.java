package ru.ave.di;

import org.springframework.stereotype.Component;

@Component
public class FriendlyGreetingService implements GreetingService{

    @Override
    public String greet(String name) {
        return name + ", Hello dear friend!";
    }
}
